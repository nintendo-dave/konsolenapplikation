package Command;

import Writer.IOutputWriter;

import java.util.List;

public abstract class Command {
    protected List<String> parameters;

    protected abstract void execute(IOutputWriter outputWriter);
    private void setParameters(List<String> parameters){

    }
}
