package Filesystem;

public class FileSystemItem {
    Directory parentDirectory;
    String name;
    String path;

    //--- Constructors
    public FileSystemItem(){}
    public FileSystemItem(String name, String path){
        this.name = name;
        this.path = path;
    }

    //--- Getter & Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public Directory getParentDirectory() {
        return parentDirectory;
    }
    public String getName() {
        return name;
    }
    public String getPath() {
        return path;
    }

}
