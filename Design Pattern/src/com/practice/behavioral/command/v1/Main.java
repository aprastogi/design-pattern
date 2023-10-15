package com.practice.behavioral.command.v1;

public class Main {

    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl(ac);
        TurnOnACCommand onACCommand = new TurnOnACCommand();
        TurnOffACCommand offACCommand = new TurnOffACCommand();

        remoteControl.setCommands(onACCommand);
        remoteControl.setCommands(offACCommand);

        remoteControl.pressButton(onACCommand);
        remoteControl.pressButton(offACCommand);
    }
}
