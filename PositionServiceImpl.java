package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.PositionDao;
import hu.uni.eku.team3.model.Position;
import hu.uni.eku.team3.service.exceptions.PositionAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.PositionNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class PositionServiceImpl implements PositionService {
    private final PositionDao dao;
    @Override
    public void create(Position positionCreate) throws PositionAlreadyExistsException {
        final boolean alreadyExists =dao.readAll()
                .stream()
                .allMatch(sl -> sl.getId() == positionCreate.getId());
        if (alreadyExists){
            throw new PositionAlreadyExistsException(String.format("Position (%s) already exists",positionCreate.toString()));
        }
        dao.create(positionCreate);
    }

    @Override
    public Collection<Position> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Integer original, Position updated) throws PositionNotFoundException {

    }

    @Override
    public void delete(Integer positionDelete) throws PositionNotFoundException {

    }
}