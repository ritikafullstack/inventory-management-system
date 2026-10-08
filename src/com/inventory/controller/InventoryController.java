package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

public class InventoryController {
    private final ProductService productService;

    public InventoryController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public Product searchProduct(Long productId) {
        return productService.getProduct(productId);
    }
}
