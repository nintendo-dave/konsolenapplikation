package Command;

import Filesystem.Drive;
import Writer.IOutputWriter;

public class DELCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        //outputWriter.printLine("Das File wurde gelöscht");
    }
}
