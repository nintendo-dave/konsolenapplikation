package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Filesystem.FileSystemItem;
import TestWriter.IOutputWriter;

//Authors: Luca v.S., David B.
public class MKDIRCommand extends Command{

    //--- Variables
    String directoryName;
    IOutputWriter outputWriter;

    //--- Constructor
    public MKDIRCommand(){ }

    //--- Methods
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        directoryName = parameters.get(0);
        this.outputWriter = outputWriter;

        //if directory name isn't already being used, then create the directory
        if(alreadyExists(directoryName, drive.getCurrentDirectory())){
            outputWriter.printLine("Ein Unterverzeichnis oder eine Datei mit dem Namen " +
                    "\""+directoryName+"\" existiert bereits.");
        } else{
            createDirectory(drive.getCurrentDirectory());
            outputWriter.printLine("");
        }

    }

    private void createDirectory(Directory currentDirectory){
        FileSystemItem newDirectory = new FileSystemItem();
        newDirectory.setName(directoryName);
        newDirectory.setParentDirectory(currentDirectory);
        newDirectory.setPath(currentDirectory.getPath());
    }

    private boolean alreadyExists(String directoryName, Directory directory){
        for(FileSystemItem item : directory.getFileSystemLists()){
            if(item.getName().equals(directoryName) && item instanceof Directory){
                return true;
            }
        }
        return false;
    }

}
