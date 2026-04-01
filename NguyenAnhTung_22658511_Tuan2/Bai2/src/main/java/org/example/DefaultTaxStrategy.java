package org.example;

public class DefaultTaxStrategy implements TaxStrategy {
    public double calculate(Product product) {
        return product.getPrice();
    }
}