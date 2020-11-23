package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Products;
import hu.uni.eku.team3.service.exceptions.*;

import java.util.Collection;

public interface PositionService {
    void create(Position positionCreate) throws PositionAlreadyExistsException;
    Collection<Position> readAll();
    void update(Integer original, Position updated) throws PositionNotFoundException;
    void delete(Integer positionDelete) throws PositionNotFoundException;
}