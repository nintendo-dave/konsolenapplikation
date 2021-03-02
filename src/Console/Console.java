package Console;

import Configurator.Configurator;
import Configurator.IConfigurator;
import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.ConsoleOutputWriter;

import java.lang.reflect.Array;
import java.sql.DriverManager;
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
        while (true) {
            String userInput = new Scanner(System.in).nextLine();
            CommandInvoker commandInvoker = new CommandInvoker(new ConsoleOutputWriter());
            commandInvoker.executeCommand(userInput);
        }
    }

    //--- Getter and Setter
    public static void setDrive(Drive drive){
        Console.drive = drive;
    }

    public static Drive getDrive(){
        return drive;
    }

}
