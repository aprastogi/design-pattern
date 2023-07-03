package com.practice.structural.decorator;

public abstract class ToppingDecorator extends Pizza{

    Pizza pizza;

    ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
