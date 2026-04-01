package org.example;

public class RefundDecorator extends OrderDecorator {

    public RefundDecorator(OrderComponent order) {
        super(order);
    }

    public void process() {
        super.process();
        refund();
    }

    private void refund() {
        System.out.println("Hoàn tiền cho khách hàng");
    }
}