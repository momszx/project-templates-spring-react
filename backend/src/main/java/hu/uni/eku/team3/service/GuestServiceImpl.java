package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.GuestDao;
import hu.uni.eku.team3.model.Guest;
import hu.uni.eku.team3.service.exceptions.GuestAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.GuestNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class GuestServiceImpl implements GuestService {
    private final GuestDao dao;
    @Override
    public void create(Guest guestCreate) throws GuestAlreadyExistsException {
        final boolean alreadyExists =dao.readAll()
                .stream()
                .allMatch(sl -> sl.getId() == guestCreate.getId());
        if (alreadyExists){
            throw new GuestAlreadyExistsException(String.format("Guest (%s) already exists",guestCreate.toString()));
        }
        dao.create(guestCreate);
    }

    @Override
    public Collection<Guest> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Integer original, Guest updated) throws GuestNotFoundException {

    }

    @Override
    public void delete(Integer guestDelete) throws GuestNotFoundException {

    }
}