package com.inventory.model;

public class Supplier {
    private Long supplierId;
    private String name;
    private String phone;
    private String email;

    public Supplier(Long supplierId, String name, String phone, String email) {
        this.supplierId = supplierId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getSupplierId() { return supplierId; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}
