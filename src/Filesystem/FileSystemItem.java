package Filesystem;

public class FileSystemItem {
    Directory parentDirectory;
    String name;
    String path;

    //Getter & Setter
    public Directory getParentDirectory() {
        return parentDirectory;
    }
    public String getName() {
        return name;
    }
    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
