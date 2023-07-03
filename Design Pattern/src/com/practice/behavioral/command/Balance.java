package com.practice.behavioral.command;

public class Balance extends CommandExecutor{

    public static final String BALANCE = "balance";

    public Balance(Database database) {
        super(database);
    }

    @Override
    public boolean isApplicable(Command command) {
        return command.getName().equals(BALANCE);
    }

    @Override
    public boolean isaValid(Command command) {
        return command.getParam().size() == 1;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParam().get(0);
        return database.getUserBalance(user).toString();
    }
}
