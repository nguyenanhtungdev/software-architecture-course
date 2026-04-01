package org.example;

public class Discount extends PaymentDecorator {
    public Discount(Payment payment) { super(payment); }

    public double pay(double amount) {
        double base = payment.pay(amount);
        return base * 0.9; // -10%
    }
}