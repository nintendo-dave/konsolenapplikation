package Factory;

import Command.Command;
import Command.ExitCommand;
import Command.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class CommandFactory {
    static public Dictionary<String, Command> getCommands(){
        Hashtable<String, Command> allCommands = new Hashtable<String, Command>();
        allCommands.put("exit", new ExitCommand());
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
}
