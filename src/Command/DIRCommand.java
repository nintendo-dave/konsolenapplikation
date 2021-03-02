package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Filesystem.FileSystemItem;
import TestWriter.IOutputWriter;

public class DIRCommand extends Command {

    private String directoryName;

    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        if (!alreadyExists(directoryName, drive.getCurrentDirectory())) {
            outputWriter.printLine("Dieses Verzeichnis Existiert nicht");
        } else {
            Directory directory = drive.getCurrentDirectory();
            for (int i = 0; i <= directory.getFileSystemLists().size(); i++) {
                outputWriter.printLine(directory.getFileSystemLists().get(i).toString());
        }
        }
    }

    // check if directory exist
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
