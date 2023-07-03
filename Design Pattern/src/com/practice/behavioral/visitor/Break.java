package com.practice.behavioral.visitor;

public class Break implements CarPart {

    public Break() {
        System.out.println("Break is created");
    }

    @Override
    public void accept(CarServiceVisitor visitor) {
        visitor.visit(this);
    }
}
