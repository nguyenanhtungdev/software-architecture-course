package org.example;

public class CreditCardPayment implements Payment {
    public double pay(double amount) {
        return amount;
    }
    public String getMethod() { return "Credit Card"; }
}