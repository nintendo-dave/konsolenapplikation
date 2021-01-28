package Command;

import Writer.IOutputWriter;

import java.util.List;

public class EXITCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter) {
        System.exit(0);
    }
}
