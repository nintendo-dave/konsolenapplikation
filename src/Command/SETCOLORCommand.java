package Command;

import Writer.IOutputWriter;

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
    protected void execute(IOutputWriter outputWriter) {

    }
}


