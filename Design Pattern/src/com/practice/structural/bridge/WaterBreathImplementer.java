package com.practice.structural.bridge;

public class WaterBreathImplementer implements BreathImplementer{

    @Override
    public void breathProcess() {
        System.out.println("Breathing inside water");
    }
}
