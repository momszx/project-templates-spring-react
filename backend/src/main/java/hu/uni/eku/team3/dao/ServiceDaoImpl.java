package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Service;
import hu.uni.eku.team3.service.exceptions.ServiceNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceDaoImpl implements ServiceDao {
    private final ServiceRepository repository;

    @Override
    public void create(Service ServiceCreate) {
            repository.save(ServiceEntityModelConverter.model2entity(ServiceCreate));
    }

    @Override
    public Collection<Service> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(ServiceEntityModelConverter::entity2model)
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Service updated) throws ServiceNotFoundException {
        if (findById(original).isPresent()) {
            repository.findById(original).map(s -> {
                s.setName(updated.getName());
                s.setPrice(updated.getPrice());
                return repository.save(s);
            });
        }
        else throw new ServiceNotFoundException(String.format("Service (%s) not found",original));
    }

    @Override
    public void delete(Integer service) throws ServiceNotFoundException {
        if (repository.findById(service).isPresent())
            repository.delete(repository.findById(service).get());
        else
            throw new ServiceNotFoundException(String.format("Service (%s) does not exists!", service));
    }

    public Optional<hu.uni.eku.team3.dao.entity.Service> findById(Integer id) {
        return repository.findById(id);
    }

    private static class ServiceEntityModelConverter {
        private static Service entity2model(hu.uni.eku.team3.dao.entity.Service entity) {
            return new Service(
                    entity.getId(),
                    entity.getName(),
                    entity.getPrice()
            );
        }

        private static hu.uni.eku.team3.dao.entity.Service model2entity(Service model) {
            return hu.uni.eku.team3.dao.entity.Service.builder()
                    .id(model.getId())
                    .name(model.getName())
                    .price(model.getPrice())
                    .build();
        }
    }
}
