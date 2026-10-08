package com.inventory.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long orderId;
    private List<OrderItem> items = new ArrayList<>();
    private String status;

    public Order(Long orderId) {
        this.orderId = orderId;
        this.status = "CREATED";
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(OrderItem::getLineTotal)
                .sum();
    }

    public Long getOrderId() { return orderId; }
    public List<OrderItem> getItems() { return items; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
