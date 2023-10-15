package com.practice.behavioral.command.v1;

public class TurnOnACCommand implements ICommand {

    @Override
    public void execute(AirConditioner ac) {
        ac.turnOn();
    }
}
