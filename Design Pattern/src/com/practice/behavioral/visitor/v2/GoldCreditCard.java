package com.practice.behavioral.visitor.v2;

public class GoldCreditCard implements CreditCard{

    @Override
    public String name() {
        return "Gold Credit Card";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
