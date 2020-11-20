package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.ComplexNumberDao;
import hu.uni.eku.team3.dao.ServiceDao;
import hu.uni.eku.team3.model.Service;
import hu.uni.eku.team3.service.exceptions.ComplexNumberAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.ServiceAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.ServiceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    private final ServiceDao dao;

    @Override
    public void create(Service service) throws ServiceAlreadyExistsException {
        final boolean isAlreadyRecorded = dao.readAll()
                .stream()
                .anyMatch(s ->
                        s.getName().equals(service.getName()) && s.getPrice() == service.getPrice());
        if (isAlreadyRecorded) {
            log.info("Service {} is already recorded!", service);
            throw new ServiceAlreadyExistsException(String.format(
                    "Service (%s) already exists!", service.toString()));

        }
        dao.create(service);
    }

    @Override
    public Collection<Service> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(String original, Service updated) throws ServiceNotFoundException {
        dao.update(original, updated);
    }

    @Override
    public void delete(String serviceId) throws ServiceNotFoundException {
        dao.delete(serviceId);
    }
}
