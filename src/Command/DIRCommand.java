package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Filesystem.FileSystemItem;
import TestWriter.IOutputWriter;

public class DIRCommand extends Command {

    private String directoryName;

    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {

        //check if any params given
        if(parameters.size() == 0){

            //check if directory has child-items
            if(drive.getCurrentDirectory().getFileSystemLists().size() > 0){
                //print name of each child-item
                for(FileSystemItem item : drive.getCurrentDirectory().getFileSystemLists()){
                    System.out.println(item.getName());
                }
            }
        }

        /*directoryName = parameters.get(0);
        if (directoryName == null) {
            Directory directory = drive.getCurrentDirectory();
            outputWriter.printLine(directory.getFileSystemLists().toString());
        } else {
            if (!alreadyExists(directoryName, drive.getCurrentDirectory())) {
                outputWriter.printLine("Dieses Verzeichnis Existiert nicht");
            } else {
                outputWriter.printLine("test");
            }
        }*/
    }


    // check if directory exist
    private boolean alreadyExists(String directoryName, Directory directory) {
        //TODO: Loop through folder and return true, if folder already exists
        // True if directory is empty cause then it's the current directory
        if (directoryName.isEmpty()) {
            return true;
        } else {
            for (FileSystemItem item : directory.getFileSystemLists()) {
                if (item.getName().equals(directoryName) && item.getClass().getName().equals("Directory")) {
                    return false;
                }
            }
        }
        return true;
    }
}
