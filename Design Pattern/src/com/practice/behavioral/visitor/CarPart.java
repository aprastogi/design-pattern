package com.practice.behavioral.visitor;

public interface CarPart {
    void accept(CarServiceVisitor visitor);
}
