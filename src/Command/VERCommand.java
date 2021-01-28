package Command;

import Writer.IOutputWriter;

public class VERCommand extends Command {
    //Variables
    String version = "Alpha 0.1";

    @Override
    protected void execute(IOutputWriter outputWriter) {
        outputWriter.printLine(version);
    }
}
