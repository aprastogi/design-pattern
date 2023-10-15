package com.practice.behavioral.command.v1;

import java.util.Stack;

public class RemoteControl {

    private  ICommand command;
    Stack<ICommand> commandHistory;

    public void setCommand(ICommand command){
        this.command = command;
        this.commandHistory = new Stack<>();
    }

    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty()) {
            ICommand command = commandHistory.pop();
            command.undo();
        }
    }
}
