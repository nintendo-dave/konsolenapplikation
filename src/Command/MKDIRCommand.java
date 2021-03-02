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
            outputWriter.printLine("Ein Unterverzeichnis mit dem Namen " +
                    "\""+directoryName+"\" existiert bereits.");
        } else{
            createDirectory(drive.getCurrentDirectory());
            outputWriter.printLine("");
        }

    }

    private void createDirectory(Directory currentDirectory){
        //create directory
        FileSystemItem newDirectory = new Directory();
        //set directory attributes
        newDirectory.setName(directoryName);
        newDirectory.setPath(currentDirectory.getPath() + currentDirectory.getName() + "\\");
        newDirectory.setParentDirectory(currentDirectory);
        //add to parent directory's item list
        currentDirectory.getFileSystemLists().add(newDirectory);
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
