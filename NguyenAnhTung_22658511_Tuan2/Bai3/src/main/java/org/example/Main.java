package org.example;

public class Main {
    public static void main(String[] args) {
        double amount = 1000;

        // Base payment
        Payment payment = new CreditCardPayment();

        // Add features (Decorator)
        payment = new ProcessingFee(payment);
        payment = new Discount(payment);

        // Strategy
        PaymentStrategy strategy = new RoundedStrategy();

        // State
        PaymentState state = new CompletedState();

        // Context
        PaymentContext context = new PaymentContext(strategy, state);

        double finalAmount = context.process(payment, amount);

        System.out.println("Method: " + payment.getMethod());
        System.out.println("Final payment: " + finalAmount);
    }
}