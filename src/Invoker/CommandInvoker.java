package Invoker;

import Command.Command;
import Console.Console;
import Factory.CommandFactory;
import Parser.CommandParser;
import Writer.ConsoleOutputWriter;
import Writer.IOutputWriter;

import java.util.Dictionary;
import java.util.List;

public class CommandInvoker {
    List<String> commands;
    ConsoleOutputWriter outputWriter;
    public CommandInvoker(IOutputWriter outputWriter) {
        this.outputWriter = (ConsoleOutputWriter) outputWriter;
        commands = CommandFactory.getCommands();
    }

    public void executeCommand(String userInput){
        String commandName = userInput.split(" ")[0];
        String commandParameters = "";
        for(int i = 1; i < userInput.split(" ").length; i++){
            if(i != userInput.split(" ").length - 1) {
                commandParameters += userInput.split(" ")[i] + " ";
            }
            else{
                commandParameters += userInput.split(" ")[i];
            }
        }
        String command = CommandParser.parseCommand(commandName);
        Command cmd = CommandFactory.getCommand(command);
        cmd.setParameters(CommandParser.parseCommandParameters(commandParameters));
        cmd.execute(new ConsoleOutputWriter(), Console.getDrive());
    }

    public void addCommand(){

    }
}
