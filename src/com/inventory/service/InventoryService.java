package com.inventory.service;

import com.inventory.repository.InventoryRepository;

public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public void addStock(Long productId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }

        int current = inventoryRepository.getAvailableQuantity(productId);
        inventoryRepository.updateQuantity(productId, current + quantity);
    }

    public void reduceStock(Long productId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }

        int available = inventoryRepository.getAvailableQuantity(productId);

        if (available < quantity) {
            throw new IllegalStateException("Insufficient stock.");
        }

        inventoryRepository.updateQuantity(productId, available - quantity);
    }
}
