package com.practice.structural.decorator;

public class Tomato extends ToppingDecorator {
    private final double cost;

    Tomato(double cost, Pizza pizza) {
        super(pizza);
        this.cost = cost;
    }

    @Override
    public double cost(){
        return cost + super.cost();
    }
}
