package Parser;

import Command.Command;
import Writer.IOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public static List<String> parseCommandParameters(String parameters){
        List<String> commandParameters = new ArrayList<>();
        for(int i = 1; i < parameters.split(" ").length; i++){
            commandParameters.add(parameters.split(" ")[i]);
        }
        return commandParameters;
    }

    public static String parseCommand(String userInput){
        return userInput.split(" ")[0];
    }
}
