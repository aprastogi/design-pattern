package com.practice.behavioral.visitor.v2;

public interface CreditCard {
    String name();
    void accept(OfferVisitor visitor);
}
