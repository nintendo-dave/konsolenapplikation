package Factory;

import Command.Command;
import Command.EXITCommand;
import Command.MKDIRCommand;
import Command.VERCommand;
import Command.DIRCommand;
import Command.SETCOLORCommand;
import Command.DELCommand;
import Command.CDCommand;
import Command.RENCommand;
import Command.MOVECommand;
import Command.CLSCommand;
import Command.MORECommand;
import Command.TYPECommand;
import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    static final String CMDEXIT = "exit";
    static final String CMDMKDIR = "mkdir";
    static final String CMDVER = "ver";
    static final String CMDDIR = "dir";
    static final String CMDSETCOLOR = "setcolor";
    static final String CMDDEL = "del";
    static final String CMDCD = "cd";
    static final String CMDREN = "ren";
    static final String CMDMOVE = "move";
    static final String CMDCLS = "cls";
    static final String CMDMORE = "more";
    static final String CMDTYPE = "type";

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
        switch (command){
            case CMDEXIT:
                return new EXITCommand();
            case CMDMKDIR:
                return new MKDIRCommand();
            case CMDVER:
                return new VERCommand();
            case CMDDIR:
                return new DIRCommand();
            case CMDSETCOLOR:
                return new SETCOLORCommand();
            case CMDDEL:
                return new DELCommand();
            case CMDCD:
                return new CDCommand();
            case CMDREN:
                return new RENCommand();
            case CMDMOVE:
                return new MOVECommand();
            case CMDCLS:
                return new CLSCommand();
            case CMDMORE:
                return new MORECommand();
            case CMDTYPE:
                return new TYPECommand();
            default:
                return null;
        }
    }
}
