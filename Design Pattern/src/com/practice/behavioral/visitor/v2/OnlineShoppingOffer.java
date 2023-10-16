package com.practice.behavioral.visitor.v2;

public class OnlineShoppingOffer implements OfferVisitor{
    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println("Gold Credit Card offers 20% Discount on Online Shopping");
    }

    @Override
    public void visit(SilverCreditCard creditCard) {
        System.out.println("Silver Credit Card offers 10% Discount on Online Shopping");
    }

    @Override
    public void visit(BronzeCreditCard creditCard) {
        System.out.println("Bronze Credit Card offers 5% Discount on Online Shopping");
    }
}
