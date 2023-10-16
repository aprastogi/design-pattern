package com.practice.behavioral.visitor.v2;

public interface OfferVisitor {
    void visit(GoldCreditCard creditCard);
    void visit(SilverCreditCard creditCard);
    void visit(BronzeCreditCard creditCard);
}
