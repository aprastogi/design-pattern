package com.practice.behavioral.command.v1;

public class TurnOffACCommand implements ICommand{

    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
