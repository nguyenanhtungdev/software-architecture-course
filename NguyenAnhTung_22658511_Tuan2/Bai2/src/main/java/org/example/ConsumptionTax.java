package org.example;

public class ConsumptionTax extends TaxDecorator {
    public ConsumptionTax(Product product) { super(product); }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.05; // 5% consumption tax
    }
}