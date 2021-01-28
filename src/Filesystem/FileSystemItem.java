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
}
