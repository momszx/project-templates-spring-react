package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.ProductsDao;
import hu.uni.eku.team3.model.Products;
import hu.uni.eku.team3.service.exceptions.ProductAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class ProductsServiceImpl implements ProductsService {
    private final ProductsDao dao;
    @Override
    public void create(Product productCreate) throws ProductAlreadyExistsException {
        final boolean alreadyExists =dao.readAll()
                .stream()
                .allMatch(sl -> sl.getId() == productCreate.getId());
        if (alreadyExists){
            throw new ProductAlreadyExistsException(String.format("Product (%s) already exists",productCreate.toString()));
        }
        dao.create(productCreate);
    }

    @Override
    public Collection<Products> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Integer original, Product updated) throws ProductNotFoundException {

    }

    @Override
    public void delete(Integer productDelete) throws ProductNotFoundException {

    }
}