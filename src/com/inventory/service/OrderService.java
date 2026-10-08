package com.inventory.service;

import com.inventory.model.Order;
import com.inventory.model.OrderItem;
import com.inventory.repository.OrderRepository;

public class OrderService {
    private final InventoryService inventoryService;
    private final OrderRepository orderRepository;

    public OrderService(InventoryService inventoryService,
                        OrderRepository orderRepository) {
        this.inventoryService = inventoryService;
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order) {
        // 1. Validate order items.
        // 2. Check inventory for every item.
        // 3. Calculate order total.
        // 4. Save the order.
        // 5. Reduce stock for each item.
        // 6. Record inventory transactions in the future database layer.

        for (OrderItem item : order.getItems()) {
            inventoryService.reduceStock(
                    item.getProductId(),
                    item.getQuantity()
            );
        }

        order.setStatus("COMPLETED");
        orderRepository.save(order);
    }
}
