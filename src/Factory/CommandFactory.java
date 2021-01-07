package Factory;

import Command.Command;
import Writer.ConsoleOutputWriter;
import Writer.IOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    static public Command getCommand(String command){
        //TODO: Make it to return different commands, according to command String
        return new Command() {
            @Override
            protected void execute(IOutputWriter outputWriter) {

            }
        };
    }
}
