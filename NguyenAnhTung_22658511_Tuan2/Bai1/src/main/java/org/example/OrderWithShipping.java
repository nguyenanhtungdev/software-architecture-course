package org.example;

public class OrderWithShipping {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void shipOrder() {
        strategy.ship();
    }
}