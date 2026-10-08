package com.inventory.model;

public class InventoryTransaction {
    private Long transactionId;
    private Long productId;
    private String type;
    private int quantity;

    public InventoryTransaction(Long transactionId, Long productId,
                                String type, int quantity) {
        this.transactionId = transactionId;
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
    }

    public Long getTransactionId() { return transactionId; }
    public Long getProductId() { return productId; }
    public String getType() { return type; }
    public int getQuantity() { return quantity; }
}
