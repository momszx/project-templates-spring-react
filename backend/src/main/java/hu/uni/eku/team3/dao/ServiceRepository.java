package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Service;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ServiceRepository extends CrudRepository<Service, Integer> {
    Service findUsageById(Integer id);

    Optional<Service> findById(Integer id);
}
