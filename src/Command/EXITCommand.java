package Command;

import Filesystem.Drive;
import TestWriter.IOutputWriter;

public class EXITCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        System.exit(0);
    }
}
