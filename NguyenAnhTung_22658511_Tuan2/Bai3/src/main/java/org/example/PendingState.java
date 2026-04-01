package org.example;

public class PendingState implements PaymentState {
    public double handle(Payment payment, double amount) {
        System.out.println("Payment is pending...");
        return payment.pay(amount);
    }
}
