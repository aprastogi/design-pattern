package com.practice.behavioral.command.v1;

public class Main {

    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOnACCommand(ac));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnOffACCommand(ac));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
