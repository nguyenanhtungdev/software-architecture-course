package org.example;

public abstract class TaxDecorator implements Product {
    protected Product product;

    public TaxDecorator(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return product.getPrice();
    }

    public String getName() {
        return product.getName();
    }
}
