package com.practice.structural.decorator;

public class Mushroom extends ToppingDecorator{
    private final double cost;

    Mushroom(double cost,Pizza pizza) {
        super(pizza);
        this.cost = cost;
    }

    @Override
    public double cost(){
        return cost + super.cost();
    }

}
