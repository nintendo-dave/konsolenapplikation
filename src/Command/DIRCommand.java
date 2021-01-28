package Command;

import Writer.IOutputWriter;

public class DIRCommand extends Command {

    private String directoryName;

    @Override
    protected void execute(IOutputWriter outputWriter) {

    }

    // check if directory exist
    public boolean doesDirectoryExists(String directoryName) {


        return false;
    }
}
