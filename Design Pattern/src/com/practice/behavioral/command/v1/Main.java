package com.practice.behavioral.command.v1;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        TurnOnACCommand onACCommand = new TurnOnACCommand();
        TurnOffACCommand offACCommand = new TurnOffACCommand();

        remoteControl.setCommands(onACCommand);
        remoteControl.setCommands(offACCommand);

        AirConditioner ac = new AirConditioner();
        ac.setRemoteControl(remoteControl);
        remoteControl.pairWithAc(ac);

        remoteControl.pressButton(onACCommand);
        remoteControl.pressButton(offACCommand);
    }
}
