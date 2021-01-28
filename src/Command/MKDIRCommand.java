package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Filesystem.File;
import Filesystem.FileSystemItem;
import Invoker.CommandInvoker;
import Writer.IOutputWriter;

import java.nio.file.FileSystem;

//Authors: Luca v.S., David B.
public class MKDIRCommand extends Command{

    //--- Variables
    String directoryName;
    IOutputWriter outputWriter;

    //--- Constructor
    public MKDIRCommand(){
        directoryName = parameters.get(0);
    }

    //--- Methods
    @Override
    protected void execute(IOutputWriter outputWriter,Drive drive) {

        this.outputWriter = outputWriter;

        if(alreadyExists(directoryName ,drive.getCurrentDirectory())){
            outputWriter.printLine("Ein Unterverzeichnis oder eine Datei mit dem Namen " +
                    "\"Desktop\" existiert bereits.");
        } else{
            //TODO: CommandInvoker muss später durch den echten ersetzt werden
            CommandInvoker temp_commandInvoker = new CommandInvoker(outputWriter);
            //TODO: Drive muss von CommandInvoker geholt werden
            Drive temp_Drive = new Drive();

            createDirectory(temp_Drive.getCurrentDirectory());
            outputWriter.printLine("");
        }

    }

    private void createDirectory(Directory currentDirectory){
        FileSystemItem newDirectory = new FileSystemItem();
        newDirectory.setName(directoryName);

    }

    private boolean alreadyExists(String directoryName, Directory directory){
        //TODO: Loop through folder and return true, if folder already exists
        for(FileSystemItem item : directory.getFileSystemLists()){
            if(item.getName().equals(directoryName) && item.getClass().getName().equals("Directory")){
                return false;
            }
        }
        return true;
    }

}
