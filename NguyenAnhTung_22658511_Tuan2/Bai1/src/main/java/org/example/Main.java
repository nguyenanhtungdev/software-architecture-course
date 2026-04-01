package org.example;

public class Main {
    public static void main(String[] args) {

        // ===== STATE =====
        System.out.println("== STATE ==");
        Order order = new Order();
        order.process(); // New -> Processing
        order.process(); // Processing -> Delivered
        order.process(); // Delivered

        // ===== STRATEGY =====
        System.out.println("\n== STRATEGY ==");
        OrderWithShipping o = new OrderWithShipping();
        o.setStrategy(new StandardShipping());
        o.shipOrder();

        o.setStrategy(new ExpressShipping());
        o.shipOrder();

        // ===== DECORATOR =====
        System.out.println("\n== DECORATOR ==");
        OrderComponent basic = new BasicOrder();
        OrderComponent refundOrder = new RefundDecorator(basic);
        refundOrder.process();
    }
}