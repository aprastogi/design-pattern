package com.practice.structural.decorator;

public class VegLoaded extends Pizza{
    double cost;

    VegLoaded(double cost){
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }
}
