package org.example;

public class RoundedStrategy implements PaymentStrategy {
    public double execute(Payment payment, double amount) {
        return Math.round(payment.pay(amount));
    }
}
