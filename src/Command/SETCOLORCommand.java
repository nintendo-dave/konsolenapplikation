package Command;

import Filesystem.Drive;
import TestWriter.IOutputWriter;

//Authors: Luca v.S., David B.
public class SETCOLORCommand extends Command{

    //--- Variables
    String color;

    //--- Constructor
    public SETCOLORCommand(){
        color = parameters.get(0);
    }

    //--- Methods
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {

    }
}


