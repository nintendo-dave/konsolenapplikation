package Parser;

import Command.Command;
import Writer.IOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public static List<String> parseCommandParameters(String parameters){
       return new ArrayList<String>();
    }

    public static Command parseCommand(String userInput){
        userInput = userInput.trim();
        String[] splittetInput = userInput.split("[ ]{1}");
        System.out.println(splittetInput[0]);
        return null;
    }
}
