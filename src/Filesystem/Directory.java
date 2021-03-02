package Filesystem;

import java.util.ArrayList;

public class Directory extends FileSystemItem {
    //--- Variables
    ArrayList<FileSystemItem> fileSystemLists = new ArrayList<>();

    //--- Constructors
    public Directory(){
        super();
    }
    public Directory(String name, String path) {
        super(name, path);
    }

    //--- Getter & Setter
    public ArrayList<FileSystemItem> getFileSystemLists() {
        return fileSystemLists;
    }
}
