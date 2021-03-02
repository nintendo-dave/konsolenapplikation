package Console;

import Configurator.Configurator;
import Configurator.IConfigurator;
import Filesystem.Directory;
import Filesystem.Drive;
import Invoker.CommandInvoker;
import TestWriter.ConsoleOutputWriter;

import java.lang.reflect.Array;
import java.sql.DriverManager;
import java.util.Scanner;

public class Console {
    Configurator configurator;
    static Drive drive = new Drive();

    public Console(IConfigurator configuator) {
        this.configurator = (Configurator) configuator;
    }

    public void start() {
        drive.setRootDirectory(new Directory("root", "C:"));
        while (true) {
            String userInput = new Scanner(System.in).nextLine();
            CommandInvoker commandInvoker = new CommandInvoker(new ConsoleOutputWriter());
            commandInvoker.executeCommand(userInput);
        }
    }

    public static Drive getDrive() {
        return drive;
    }
}