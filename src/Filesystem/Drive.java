package Filesystem;

import java.util.List;

public class Drive {
    String name;
    String label;
    int size;
    Directory rootDirectory;
    Directory currentDirectory;
    String prompt;
    List<FileSystemItem> fileSystemItems;

    private void restore(){

    }

    private void save(){

    }

    //Getter & Setter
    public Directory getCurrentDirectory() {
        return currentDirectory;
    }
    private void setCurrentDirectory(){

    }

}
