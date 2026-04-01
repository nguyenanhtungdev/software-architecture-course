package org.example;

public class NewState implements OrderState {
    public void handle(Order context) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        context.setState(new ProcessingState());
    }
}
