package Command;

import java.util.List;

public abstract class Command {
    protected List<String> parameters;

    protected abstract void execute();
    private void setParameters(List<String> parameters){

    }
}
