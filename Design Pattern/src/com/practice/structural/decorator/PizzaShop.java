package com.practice.structural.decorator;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza vegLoaded = new Tomato(10,new Mushroom(15,new VegLoaded(300)));
        Pizza margherita = new Mushroom(15,new Margherita(150));
        System.out.println("Total cost is " + vegLoaded.cost());
        System.out.println("Total cost is " + margherita.cost());
    }
}
