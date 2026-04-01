package org.example;

public class OrderContext {
    private TaxStrategy strategy;
    private OrderState state;

    public OrderContext(TaxStrategy strategy, OrderState state) {
        this.strategy = strategy;
        this.state = state;
    }

    public double checkout(Product product) {
        double priceAfterState = state.apply(product);
        return strategy.calculate(new BasicProduct(product.getName(), priceAfterState));
    }
}