package Console;

import Configurator.Configurator;
import Configurator.IConfigurator;
import Filesystem.Directory;
import Filesystem.Drive;
import Invoker.CommandInvoker;
import TestWriter.ConsoleOutputWriter;

import java.util.Scanner;

public class Console {
    //--- Variables
    Configurator configurator;
    private static Drive drive;

    //--- Constructor
    public Console(IConfigurator configuator){
        this.configurator = (Configurator) configuator;
    }

    //--- Methods
    public void start(){
        setupDrive();
        while (true) {
            //Prompt
            System.out.print(drive.getCurrentDirectory().getPath() + drive.getCurrentDirectory().getName() + "> ");

            //Read input
            String userInput = new Scanner(System.in).nextLine();
            CommandInvoker commandInvoker = new CommandInvoker(new ConsoleOutputWriter());
            commandInvoker.executeCommand(userInput);
        }
    }

    private void setupDrive(){
        Drive temp_drive = new Drive("MAINDRIVE", "C");

        //create root directory of drive
        Directory rootDir = new Directory("\\", "C:");
        //create directory in which is being tested
        Directory dir = new Directory("bob", "C:\\");
        dir.setPath(rootDir.getPath());
        rootDir.getFileSystemLists().add(dir);


        //finish initializing drive
        dir.setParentDirectory(rootDir);
        temp_drive.setCurrentDirectory(rootDir);
        temp_drive.setRootDirectory(rootDir);
        Console.setDrive(temp_drive);
    }

    //--- Getter and Setter
    public static void setDrive(Drive drive){
        Console.drive = drive;
    }

    public static Drive getDrive(){
        return drive;
    }

}
