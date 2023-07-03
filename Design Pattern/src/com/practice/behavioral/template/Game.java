package com.practice.behavioral.template;

public abstract class Game {
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    // Template method
    public final void play(){
        // Initialize the game
        initialize();
        // Start the game
        start();
        // End the game
        end();
    }
}
