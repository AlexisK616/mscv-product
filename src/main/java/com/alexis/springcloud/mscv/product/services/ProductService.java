package com.alexis.springcloud.mscv.product.services;

import java.util.List;
import java.util.Optional;
import com.alexis.springcloud.mscv.product.entities.Product;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
}
