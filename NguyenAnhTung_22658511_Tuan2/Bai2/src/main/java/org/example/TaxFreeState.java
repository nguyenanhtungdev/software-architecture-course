package org.example;

class TaxFreeState implements OrderState {
    public double apply(Product product) {
        return product.getPrice(); // assume already tax-free
    }
}
