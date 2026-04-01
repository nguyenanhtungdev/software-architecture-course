package org.example;

public class VATTax extends TaxDecorator {
    public VATTax(Product product) { super(product); }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.1; // 10% VAT
    }
}