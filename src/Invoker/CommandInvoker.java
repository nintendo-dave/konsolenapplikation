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
        String command = CommandParser.parseCommand(userInput);
        Command cmd = CommandFactory.getCommand(command);
        cmd.setParameters(CommandParser.parseCommandParameters(userInput));
        cmd.execute(new ConsoleOutputWriter(), Console.getDrive());
    }

    public void addCommand(){

    }
}
