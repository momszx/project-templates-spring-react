package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Products;
import hu.uni.eku.team3.service.exceptions.*;

import java.util.Collection;

public interface ProductsService {
    Collection<Products> readAll();
}