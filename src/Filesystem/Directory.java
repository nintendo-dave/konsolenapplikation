package Filesystem;

import java.util.ArrayList;

public class Directory extends FileSystemItem {
    ArrayList<FileSystemItem> fileSystemLists;

    public Directory(String name, String path) {
        super(name, path);
    }

    //Getter & Setter
    public ArrayList<FileSystemItem> getFileSystemLists() {
        return fileSystemLists;
    }
}
