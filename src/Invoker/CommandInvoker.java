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
    //--- Variables
    List<String> commands;
    IOutputWriter outputWriter;

    //--- Constructor
    public CommandInvoker(IOutputWriter outputWriter) {
        this.outputWriter =  outputWriter;
        commands = CommandFactory.getCommands();
    }

    //--- Methods
    public void executeCommand(String userInput){
        String command = CommandParser.parseCommand(userInput);
        Command cmd = CommandFactory.getCommand(command);
        cmd.setParameters(CommandParser.parseCommandParameters(userInput));
        cmd.execute(outputWriter, Console.getDrive());
    }

    public void addCommand(){

    }
}