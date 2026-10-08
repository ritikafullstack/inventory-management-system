package com.inventory.repository;

import com.inventory.model.Product;
import java.util.List;

public interface ProductRepository {
    Product findById(Long productId);
    List<Product> findAll();
    void save(Product product);
    void update(Product product);
}
