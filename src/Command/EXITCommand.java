package Command;

import Filesystem.Drive;
import Writer.IOutputWriter;

import java.util.List;

public class EXITCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        System.exit(0);
    }
}
