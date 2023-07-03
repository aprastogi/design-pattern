package com.practice.behavioral.visitor;

public class Door implements CarPart {

    public Door() {
        System.out.println("Door is created");
    }
    @Override
    public void accept(CarServiceVisitor visitor) {
        visitor.visit(this);
    }
}
