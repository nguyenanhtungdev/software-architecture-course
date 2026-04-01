package org.example;

class DiscountState implements OrderState {
    public double apply(Product product) {
        return product.getPrice() * 0.9; // 10% discount
    }
}
