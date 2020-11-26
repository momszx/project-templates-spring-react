package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Service;
import hu.uni.eku.team3.service.exceptions.ServiceAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.ServiceNotFoundException;

import java.util.Collection;

public interface ServiceService {
    void create(Service service) throws ServiceAlreadyExistsException;

    Collection<Service> readAll();

    void update(Integer original, Service updated) throws ServiceNotFoundException;

    void delete(Integer serviceId) throws ServiceNotFoundException;
}
