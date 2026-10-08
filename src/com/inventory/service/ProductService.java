package com.inventory.service;

import com.inventory.model.Product;
import com.inventory.repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("Product name is required.");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        productRepository.save(product);
    }

    public Product getProduct(Long productId) {
        return productRepository.findById(productId);
    }

    public void updateProduct(Product product) {
        productRepository.update(product);
    }
}
