package com.practice.behavioral.strategy;

public class PaymentService {
    private final Strategy paymentStrategy;

    public PaymentService(Strategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public boolean pay(double amount){
        paymentStrategy.pay(amount);
        return true;
    }
}
