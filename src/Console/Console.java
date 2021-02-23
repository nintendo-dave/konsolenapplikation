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
    Configurator configurator;
    static Drive drive;
    public Console(IConfigurator configuator){
        this.configurator = (Configurator) configuator;
    }
    public void start(){
        while (true) {
            String userInput = new Scanner(System.in).nextLine();
            CommandInvoker commandInvoker = new CommandInvoker(new ConsoleOutputWriter());
            commandInvoker.executeCommand(userInput);
        }
    }

    public static Drive getDrive(){
        return drive;
    }

}
