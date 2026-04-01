package org.example;

public class NormalState implements OrderState {
    public double apply(Product product) {
        return product.getPrice();
    }
}