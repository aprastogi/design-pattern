package com.practice.behavioral.template;

public class Cricket extends Game{

    @Override
    public void initialize() {
        System.out.println("Cricket is being initialize");
    }

    @Override
    public void start() {
        System.out.println("Cricket is initialized, Enjoy the game");
    }

    @Override
    public void end() {
        System.out.println("Cricket is ended");
    }
}
