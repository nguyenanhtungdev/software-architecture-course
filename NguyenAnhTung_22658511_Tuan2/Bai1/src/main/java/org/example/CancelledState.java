package org.example;

public class CancelledState implements OrderState {
    public void handle(Order context) {
        System.out.println("Đơn hàng đã bị hủy!");
    }
}