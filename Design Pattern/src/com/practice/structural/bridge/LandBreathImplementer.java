package com.practice.structural.bridge;

public class LandBreathImplementer implements BreathImplementer{

    @Override
    public void breathProcess() {
        System.out.println("Breathing on Land");
    }
}
