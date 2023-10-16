package com.practice.behavioral.command.v2;

import java.util.List;

public class Command {
    private CommandType name;
    private List<String> param;

    public CommandType getName() {
        return name;
    }

    public List<String> getParam() {
        return param;
    }

    public Command(CommandType name, List<String> param) {
        this.name = name;
        this.param = param;
    }
}