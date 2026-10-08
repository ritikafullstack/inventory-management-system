package com.inventory.model;

public class Product {
    private Long productId;
    private String name;
    private String category;
    private double price;
    private int reorderLevel;
    private boolean active;

    public Product(Long productId, String name, String category,
                   double price, int reorderLevel) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.reorderLevel = reorderLevel;
        this.active = true;
    }

    public Long getProductId() { return productId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getReorderLevel() { return reorderLevel; }
    public boolean isActive() { return active; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setReorderLevel(int reorderLevel) { this.reorderLevel = reorderLevel; }
    public void setActive(boolean active) { this.active = active; }
}
