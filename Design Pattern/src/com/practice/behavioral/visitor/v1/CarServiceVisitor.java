package com.practice.behavioral.visitor.v1;

public interface CarServiceVisitor {
    void visit(Door door);

    void visit(Engine engine);

    void visit(Break breakPart);
}
