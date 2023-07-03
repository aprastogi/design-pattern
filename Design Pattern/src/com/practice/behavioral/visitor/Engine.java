package com.practice.behavioral.visitor;

public class Engine implements CarPart {

    public Engine() {
        System.out.println("Engine is created");
    }

    @Override
    public void accept(CarServiceVisitor visitor) {
        visitor.visit(this);
    }
}
