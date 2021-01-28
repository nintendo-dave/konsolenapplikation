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


    //--- Constructors
    public Drive(){}

    public Drive(String name, String label){
        this.name = name;
        this.label = label;
    }
    //--- Methods

    private void restore(){

    }

    private void save(){

    }

    //--- Getter & Setter
    public Directory getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(Directory directory){

    }

    public void setRootDirectory(Directory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

}
