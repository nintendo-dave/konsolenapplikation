package Filesystem;

import java.util.ArrayList;

public class Directory extends FileSystemItem {
    ArrayList<FileSystemItem> fileSystemLists;

    //Getter & Setter
    public ArrayList<FileSystemItem> getFileSystemLists() {
        return fileSystemLists;
    }
}
