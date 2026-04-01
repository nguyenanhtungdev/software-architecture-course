package org.example;

public interface PaymentState {
    double handle(Payment payment, double amount);
}
