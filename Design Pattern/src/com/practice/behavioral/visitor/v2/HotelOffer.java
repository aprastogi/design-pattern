package com.practice.behavioral.visitor.v2;

public class HotelOffer implements OfferVisitor{

    @Override
    public void visit(GoldCreditCard creditCard) {
        System.out.println("Gold Credit Card offers 30% Discount on Hotel");
    }

    @Override
    public void visit(SilverCreditCard creditCard) {
        System.out.println("Silver Credit Card offers 20% Discount on Hotel");
    }

    @Override
    public void visit(BronzeCreditCard creditCard) {
        System.out.println("Bronze Credit Card offers 10% Discount on Hotel");
    }
}
