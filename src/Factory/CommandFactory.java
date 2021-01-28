package Factory;

import Command.Command;
import Command.EXITCommand;
import Command.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class CommandFactory {
    public static Dictionary<String, Command> getCommands(){
        Hashtable<String, Command> allCommands = new Hashtable<String, Command>();
        allCommands.put("exit", new EXITCommand());
        allCommands.put("mkdir", new MKDIRCommand());
        allCommands.put("ver", new VERCommand());
        allCommands.put("dir", new DIRCommand());
        allCommands.put("setcolor", new SETCOLORCommand());
        allCommands.put("del", new DELCommand());
        allCommands.put("cd", new CDCommand());
        allCommands.put("ren", new RENCommand());
        allCommands.put("move", new MOVECommand());
        allCommands.put("cls", new CLSCommand());
        allCommands.put("more", new MORECommand());
        allCommands.put("type", new TYPECommand());
        return allCommands;
    }

    public static Command getCommand(Command command){
        return new ExitCommand();
    }
}
