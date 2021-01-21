package Command;

import Writer.IOutputWriter;

//Authors: Luca v.S., David B.
public class MKDIRCommand extends Command{

    //--- Variables
    String folder;

    //--- Constructor
    public MKDIRCommand(){
        folder = parameters.get(0);
    }

    //--- Methods
    @Override
    protected void execute(IOutputWriter outputWriter) {
        if(alreadyExists(folder)){
            outputWriter.printLine("Ein Unterverzeichnis oder eine Datei mit dem Namen " +
                    "\"Desktop\" existiert bereits.");
        } else{
            outputWriter.printLine("");
        }

    }

    private boolean alreadyExists(String filename){
        //TODO: Loop through folder and return true, if folder already exists
        return true;
    }

}
