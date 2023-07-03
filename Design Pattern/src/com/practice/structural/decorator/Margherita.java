package com.practice.structural.decorator;

public class Margherita extends Pizza {
    double cost;

    public Margherita(double cost){
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }
}
