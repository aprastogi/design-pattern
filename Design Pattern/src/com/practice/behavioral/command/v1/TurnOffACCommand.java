package com.practice.behavioral.command.v1;

public class TurnOffACCommand implements ICommand{

    @Override
    public void execute(AirConditioner ac) {
        ac.turnOff();
    }
}
