package Parser;

import Command.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public static List<String> parseCommandParameters(String parameters){
       return new ArrayList<String>();
    }

    public static Command parseCommand(String userInput){
        return new Command() {
            @Override
            protected void execute() {

            }
        };
    }
}
