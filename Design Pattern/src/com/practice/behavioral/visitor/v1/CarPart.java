package com.practice.behavioral.visitor.v1;

public interface CarPart {
    void accept(CarServiceVisitor visitor);
}
