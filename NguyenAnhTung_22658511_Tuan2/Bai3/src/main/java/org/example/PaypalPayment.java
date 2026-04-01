package org.example;

public class PaypalPayment implements Payment {
    public double pay(double amount) {
        return amount;
    }
    public String getMethod() { return "PayPal"; }
}
