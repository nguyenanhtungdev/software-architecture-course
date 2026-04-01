package org.example;

public class NormalStrategy implements PaymentStrategy {
    public double execute(Payment payment, double amount) {
        return payment.pay(amount);
    }
}
