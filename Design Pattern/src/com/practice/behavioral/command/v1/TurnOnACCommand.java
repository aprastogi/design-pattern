package com.practice.behavioral.command.v1;

public class TurnOnACCommand implements ICommand {

    AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
