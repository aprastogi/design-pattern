package com.practice.structural.bridge;

public abstract class LivingThings {

     BreathImplementer breathImplementer;

    public LivingThings(BreathImplementer breathImplementer) {
        this.breathImplementer = breathImplementer;
    }

    public abstract void breath();
}
