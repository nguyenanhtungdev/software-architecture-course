package org.example;

public class ProcessingFee extends PaymentDecorator {
    public ProcessingFee(Payment payment) { super(payment); }

    public double pay(double amount) {
        double base = payment.pay(amount);
        return base * 1.05; // +5% fee
    }
}