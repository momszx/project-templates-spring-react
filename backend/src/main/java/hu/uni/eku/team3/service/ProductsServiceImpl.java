package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.ProductsDao;
import hu.uni.eku.team3.model.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class ProductsServiceImpl implements ProductsService {
    private final ProductsDao dao;

    @Override
    public Collection<Products> readAll() {
        return dao.readAll();
    }

}