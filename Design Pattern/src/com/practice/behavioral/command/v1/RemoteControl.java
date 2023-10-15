package com.practice.behavioral.command.v1;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    AirConditioner ac;

    private final List<ICommand> commands;

    public RemoteControl(AirConditioner ac){
        this.ac = ac;
        this.commands = new ArrayList<>();
    }

    public void setCommands(ICommand commands){
        this.commands.add(commands);
    }

    public void pressButton(ICommand command){
       if(!commands.contains(command)){
           throw new RuntimeException("Not a valid command");
       }
       command.execute(ac);
    }
}
