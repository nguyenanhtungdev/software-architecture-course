package org.example;

public class FailedState implements PaymentState {
    public double handle(Payment payment, double amount) {
        System.out.println("Payment failed!");
        return 0;
    }
}

