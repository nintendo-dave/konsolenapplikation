package Command;

import Filesystem.Drive;
import Writer.IOutputWriter;

public class VERCommand extends Command {
    //Variables
    String version = "Alpha 1.0";

    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        outputWriter.printLine(version);
    }

}
