package com.practice.behavioral.command;

public class Recharge extends CommandExecutor{

    public static final String RECHARGE = "recharge";
    private final RechargeProvider rechargeProvider;

    public Recharge(Database database, RechargeProvider rechargeProvider) {
        super(database);
        this.rechargeProvider = rechargeProvider;
    }

    @Override
    public boolean isApplicable(Command command) {
        return command.getName().equals(RECHARGE);
    }

    @Override
    public boolean isaValid(Command command) {
        return command.getParam().size() == 2;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParam().get(0);
        Integer rechargeAmount = Integer.parseInt(command.getParam().get(1));

        Integer userBalance = database.getUserBalance(user);
        if(userBalance < rechargeAmount){
            return "Not sufficient balance";
        }
        rechargeProvider.recharge(user, rechargeAmount);
        return "Recharge done";
    }
}
