package Command;

import Filesystem.Drive;
import TestWriter.IOutputWriter;

public class VERCommand extends Command {
    //Variables
    String version = "Alpha 0.1";

    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        outputWriter.printLine(version);
    }

}
