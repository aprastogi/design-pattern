package com.practice.behavioral.visitor;

public interface CarServiceVisitor {
    void visit(Door door);

    void visit(Engine engine);

    void visit(Break breakPart);
}
