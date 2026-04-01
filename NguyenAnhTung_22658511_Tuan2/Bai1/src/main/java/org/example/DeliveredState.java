package org.example;

public class DeliveredState implements OrderState {
    public void handle(Order context) {
        System.out.println("Đơn hàng đã giao thành công!");
    }
}