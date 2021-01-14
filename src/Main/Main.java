package Main;

import Configurator.Configurator;
import Console.Console;

public class Main {
    public static void main(String[] args) {
        Console console = new Console(new Configurator());
        console.start();
    }
}
