package com.practice.behavioral.command;

import java.util.List;

public class CommandRunner {

   List<CommandExecutor> executorList;

   public CommandRunner(List<CommandExecutor> executorList){
      this.executorList = executorList;
   }

   public String runCommand(Command command){
      for(CommandExecutor commandExecutor : executorList){
         if(commandExecutor.isApplicable(command)){
            return commandExecutor.execute(command);
         }
      }
      return "Invalid Command";
   }
}
