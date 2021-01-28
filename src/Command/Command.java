package Command;

import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.IOutputWriter;

import java.util.List;

public abstract class Command {
    protected List<String> parameters;

    public abstract void execute(IOutputWriter outputWriter, Drive drive); //Überladung geändert von David
    //Grund: Bei MDDIR braucht eine referenz zur Drive, um überhaupt ein Ordner zu erstellen


    public void setParameters(List<String> parameters){
        this.parameters = parameters;
    }
}
