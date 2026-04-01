package org.example;

public class ProcessingState implements OrderState {
    public void handle(Order context) {
        System.out.println("Đóng gói và vận chuyển...");
        context.setState(new DeliveredState());
    }
}