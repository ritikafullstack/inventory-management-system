package com.inventory.repository;

import com.inventory.model.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(Long orderId);
}
