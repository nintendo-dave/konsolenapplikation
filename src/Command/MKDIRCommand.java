package Command;

import Writer.IOutputWriter;

public class MKDIRCommand extends Command{

    //--- Variables
    String filename;

    //--- Constructor
    public MKDIRCommand(){
        filename = parameters.get(0);
    }

    //--- Methods
    @Override
    protected void execute(IOutputWriter outputWriter) {
        if(alreadyExists(filename)){
            outputWriter.printLine("Ein Unterverzeichnis oder eine Datei mit dem Namen " +
                    "\"Desktop\" existiert bereits.");
        } else{
            outputWriter.printLine("");
        }

    }

    private boolean alreadyExists(String filename){
        //TODO: Loop through folder and return true, if already exists
        return true;
    }

}
