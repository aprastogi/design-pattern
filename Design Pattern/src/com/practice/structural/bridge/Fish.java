package com.practice.structural.bridge;

public class Fish extends LivingThings{

    Fish(BreathImplementer breathImplementer){
        super(breathImplementer);
    }
    @Override
    public void breath() {
        breathImplementer.breathProcess();
    }
}
