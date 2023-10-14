package com.practice.behavioral.strategy;

public class OrderService {
    private final CartService cart;
    private final PaymentService paymentService;

    public OrderService(CartService cart, PaymentService paymentService){
        this.cart = cart;
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        double amount = cart.calculateTotal();
        boolean result = paymentService.pay(amount);
        if(result){
            System.out.println("Your order is successful");
        } else{
            System.out.println("Payment Failed");
        }
    }
}
