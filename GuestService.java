package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Products;
import hu.uni.eku.team3.service.exceptions.*;

import java.util.Collection;

public interface GuestService {
    void create(Guest guestCreate) throws GuestAlreadyExistsException;
    Collection<Guest> readAll();
    void update(Integer original, Guest updated) throws GuestNotFoundException;
    void delete(Integer guestDelete) throws GuestNotFoundException;
}