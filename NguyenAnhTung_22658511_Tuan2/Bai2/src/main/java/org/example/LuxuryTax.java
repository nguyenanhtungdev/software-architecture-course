package org.example;

public class LuxuryTax extends TaxDecorator {
    public LuxuryTax(Product product) { super(product); }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.2; // 20% luxury tax
    }
}