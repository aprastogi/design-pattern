package com.practice.behavioral.command;

public abstract class CommandExecutor {

    protected Database database;

    public CommandExecutor(Database database){
        this.database = database;
    }

    public String execute(Command command){
        if(!isaValid(command)){
            return "Invalid Command";
        }
        return executeValidCommand(command);
    }

    public abstract boolean isApplicable(Command command);
    public abstract boolean isaValid(Command command);
    protected abstract String executeValidCommand(Command command);
}
