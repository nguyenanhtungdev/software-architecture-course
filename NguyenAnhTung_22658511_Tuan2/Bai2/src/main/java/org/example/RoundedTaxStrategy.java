package org.example;

public class RoundedTaxStrategy implements TaxStrategy {
    public double calculate(Product product) {
        return Math.round(product.getPrice());
    }
}
