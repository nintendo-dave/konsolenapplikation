package Command;

import Filesystem.Drive;
import Filesystem.FileSystemItem;
import Writer.IOutputWriter;

import java.util.ArrayList;

public class DELCommand extends Command {
    String fileName;

    public DELCommand() {
        fileName = parameters.get(0);
    }

    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        ArrayList<FileSystemItem> fileSystemItemArrayList = drive.getCurrentDirectory().getFileSystemLists();

        for (int i = 0; i < fileSystemItemArrayList.size(); i++) {
            if (fileSystemItemArrayList.get(i).equals(fileName)) {
                drive.getCurrentDirectory().getFileSystemLists().remove(i);
                outputWriter.printLine("Das File wurde gelöscht");
            }
        }
    }
}
