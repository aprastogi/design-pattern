package com.practice.structural.bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathImplementer());
        fish.breath();

        LivingThings dog = new Fish(new LandBreathImplementer());
        dog.breath();
    }
}
