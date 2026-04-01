package org.example;

public class PaymentContext {
    private PaymentStrategy strategy;
    private PaymentState state;

    public PaymentContext(PaymentStrategy strategy, PaymentState state) {
        this.strategy = strategy;
        this.state = state;
    }

    public double process(Payment payment, double amount) {
        double afterState = state.handle(payment, amount);
        return strategy.execute(payment, afterState);
    }
}