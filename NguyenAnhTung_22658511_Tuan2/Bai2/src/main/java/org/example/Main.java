package org.example;

public class Main {
    public static void main(String[] args) {
        // Base product
        Product product = new BasicProduct("Luxury Watch", 1000);

        // Apply taxes (Decorator)
        product = new VATTax(product);
        product = new LuxuryTax(product);

        // Choose strategy
        TaxStrategy strategy = new RoundedTaxStrategy();

        // Choose state
        OrderState state = new DiscountState();

        // Context
        OrderContext context = new OrderContext(strategy, state);

        double finalPrice = context.checkout(product);

        System.out.println("Final price: " + finalPrice);
    }
}
