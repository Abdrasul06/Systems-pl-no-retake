package service;

import model.Order;

public class CheckoutSaga {

    public void checkout(Order order) {
        try {
            doPayment(order);
            doInventory(order);
            doShipping(order);
            System.out.println("Checkout successful!");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            compensateShipping(order);
            compensateInventory(order);
            compensatePayment(order);
            System.out.println("Rollback completed!");
        }
    }


    private void doPayment(Order order) throws Exception {
        System.out.println("Payment done for order " + order.getId());

    }

    private void compensatePayment(Order order) {
        System.out.println("Payment refunded for order " + order.getId());
    }

    private void doInventory(Order order) throws Exception {
        System.out.println("Inventory reserved for order " + order.getId());
    }

    private void compensateInventory(Order order) {
        System.out.println("Inventory released for order " + order.getId());
    }


    private void doShipping(Order order) throws Exception {
        System.out.println("Shipping scheduled for order " + order.getId());
    }

    private void compensateShipping(Order order) {
        System.out.println("Shipping cancelled for order " + order.getId());
    }
}