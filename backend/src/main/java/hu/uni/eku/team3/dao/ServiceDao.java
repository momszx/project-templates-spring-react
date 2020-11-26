package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Service;
import hu.uni.eku.team3.service.exceptions.ServiceNotFoundException;

import java.util.Collection;
import java.util.Optional;

public interface ServiceDao {
    void create(Service serviceCreate);

    Collection<Service> readAll();

    void update(Integer original, Service updated) throws ServiceNotFoundException;

    void delete(Integer service) throws ServiceNotFoundException;

    Optional<hu.uni.eku.team3.dao.entity.Service> findById(Integer id);
}
