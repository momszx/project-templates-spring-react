package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Products;
import hu.uni.eku.team3.service.exceptions.*;

import java.util.Collection;

public interface ProductsService {
    void create(Products productCreate) throws ProductAlreadyExistsException;
    Collection<Products> readAll();
    void update(Integer original, Products updated) throws ProductNotFoundException;
    void delete(Integer productDelete) throws ProductNotFoundException;
}