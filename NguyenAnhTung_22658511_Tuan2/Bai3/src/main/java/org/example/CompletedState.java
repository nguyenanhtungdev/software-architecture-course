package org.example;

public class CompletedState implements PaymentState {
    public double handle(Payment payment, double amount) {
        System.out.println("Payment completed!");
        return payment.pay(amount);
    }
}