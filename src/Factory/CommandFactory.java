package Factory;

import Command.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    static public Command getCommand(String command){
        return new Command() {
            @Override
            public void execute() {

            }
        };
    }
}
