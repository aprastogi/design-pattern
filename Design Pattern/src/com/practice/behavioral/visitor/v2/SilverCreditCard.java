package com.practice.behavioral.visitor.v2;

public class SilverCreditCard implements CreditCard{

    @Override
    public String name() {
        return "Silver Credit Card";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
