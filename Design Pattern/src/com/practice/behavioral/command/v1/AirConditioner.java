package com.practice.behavioral.command.v1;

public class AirConditioner {

    RemoteControl remoteControl;

    public void setRemoteControl(RemoteControl remoteControl){
        this.remoteControl = remoteControl;
    }

    public void turnOn(){
        System.out.println("AC Turned ON");
    }

    public void turnOff(){
        System.out.println("AC Turned OFF");
    }
}
