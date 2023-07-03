package com.practice.structural.bridge;

public class Dog extends LivingThings{

    public Dog(BreathImplementer breathImplementer) {
        super(breathImplementer);
    }

    @Override
    public void breath() {
        breathImplementer.breathProcess();
    }
}
