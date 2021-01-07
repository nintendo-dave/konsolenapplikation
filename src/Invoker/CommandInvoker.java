package Invoker;

import Command.Command;
import Writer.ConsoleOutputWriter;
import Writer.IOutputWriter;

import java.util.Dictionary;

public class CommandInvoker {
    Dictionary<String, Command> commands;
    ConsoleOutputWriter outputWriter;
    public CommandInvoker(IOutputWriter outputWriter) {
        this.outputWriter = (ConsoleOutputWriter) outputWriter;
    }

    public void executeCommand(String userInput){

    }

    public void addCommand(){

    }
}
