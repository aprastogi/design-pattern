package com.practice.behavioral.strategy;

public class PhonePe implements Strategy{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by phonepe");
    }
}
