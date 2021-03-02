package Filesystem;
import java.util.List;
public class Drive {
    //--- Variables
    private String name;
    private String label;
    private int size;
    private Directory rootDirectory;
    private Directory currentDirectory;
    private String prompt;
    private List<FileSystemItem> fileSystemItems;

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
        this.currentDirectory = directory;
    }
    public void setRootDirectory(Directory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }
}