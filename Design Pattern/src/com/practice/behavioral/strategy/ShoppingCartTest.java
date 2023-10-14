package com.practice.behavioral.strategy;

public class ShoppingCartTest {

    public static void main(String[] args) {
        CartService cart = new CartService();
        PaymentService paymentService = new PaymentService(new CreditCard());
        OrderService orderService = new OrderService(cart, paymentService);
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        orderService.placeOrder();
    }
}
