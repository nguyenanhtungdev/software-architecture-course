package org.example;

public interface PaymentStrategy {
    double execute(Payment payment, double amount);
}
