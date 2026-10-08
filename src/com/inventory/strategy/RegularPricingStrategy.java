package com.inventory.strategy;

public class RegularPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int quantity) {
        return basePrice * quantity;
    }
}
