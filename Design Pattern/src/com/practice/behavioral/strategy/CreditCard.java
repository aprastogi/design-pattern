package com.practice.behavioral.strategy;

public class CreditCard implements Strategy{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by credit card");
    }
}
