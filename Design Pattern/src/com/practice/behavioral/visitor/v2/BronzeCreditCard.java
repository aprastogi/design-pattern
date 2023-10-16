package com.practice.behavioral.visitor.v2;

public class BronzeCreditCard implements CreditCard{

    @Override
    public String name() {
        return "Bronze Credit Card";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
