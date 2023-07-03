package com.practice.behavioral.template;

public class Football extends Game{

    @Override
    public void initialize() {
        System.out.println("Football is being initialize");
    }

    @Override
    public void start() {
        System.out.println("Football is initialized, Enjoy the game");
    }

    @Override
    public void end() {
        System.out.println("Football is ended");
    }
}
