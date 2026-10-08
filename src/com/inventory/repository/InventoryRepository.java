package com.inventory.repository;

public interface InventoryRepository {
    int getAvailableQuantity(Long productId);
    void updateQuantity(Long productId, int newQuantity);
}
