package Console;

import Configurator.Configurator;
import Configurator.IConfigurator;
import Invoker.CommandInvoker;
import Writer.ConsoleOutputWriter;

import java.util.Scanner;

public class Console {
    Configurator configurator;
    public Console(IConfigurator configuator){
        this.configurator = (Configurator) configuator;
    }
    public void start(){
        String userInput = new Scanner(System.in).nextLine();
        CommandInvoker commandInvoker = new CommandInvoker(new ConsoleOutputWriter());
        commandInvoker.executeCommand(userInput);
    }

    public void processInput(){

    }
}
