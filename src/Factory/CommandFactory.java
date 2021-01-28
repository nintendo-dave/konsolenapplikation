package Factory;

import Command.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static List<String> getCommands(){
        List<String> allCommands = new ArrayList<String>();
        allCommands.add("exit");
        allCommands.add("mkdir");
        allCommands.add("ver");
        allCommands.add("dir");
        allCommands.add("setcolor");
        allCommands.add("del");
        allCommands.add("cd");
        allCommands.add("ren");
        allCommands.add("move");
        allCommands.add("cls");
        allCommands.add("more");
        allCommands.add("type");
        return allCommands;
    }

    public static Command getCommand(String command){
        return null;
    }
}
