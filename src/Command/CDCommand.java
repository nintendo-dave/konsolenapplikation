package Command;
import Filesystem.Directory;
import Filesystem.Drive;
import TestWriter.IOutputWriter;
public class CDCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        if(parameters.get(0).equals("\\") || parameters.get(0).equals("/")){
            drive.getCurrentDirectory().setPath("C:");
        }
        else if(parameters.get(0).equals("..")) {
            boolean isRootDirectory = false;
            String[] array = drive.getCurrentDirectory().getPath().split("/");
            String path = "";
            try{
                if(array[1] == null){
                }
            }catch(Exception e){
                isRootDirectory = true;
            }
            if(!isRootDirectory) {
                for (int i = 0; i < array.length - 1; i++) {
                    path += array[i];
                }
                drive.getCurrentDirectory().setPath(path);
            }
        }
        else if(parameters.get(0).startsWith("..")){
            boolean allAreSame = false;
            String[] array = parameters.get(0).split("/");
            for(int i = 0; i < array.length; i++){
                if(i <= array.length - 2) {
                    if (array[i].equals(array[i + 1])) {
                        allAreSame = true;
                    }
                    else{
                        allAreSame = false;
                        break;
                    }
                }
            }
            if(allAreSame) {
                String[] array1 = drive.getCurrentDirectory().getPath().split("/");
                String path = "";
                for (int i = 0; i < array1.length - array.length; i++) {
                    path += array1[i];
                }
                drive.setCurrentDirectory(new Directory("name", path));
            }
        }
        else if(parameters.get(0).matches("^[a-zA-Z1-9äüö/]+")){
            if(parameters.get(0).split(" ").length != 0){
                drive.getCurrentDirectory().setPath(drive.getCurrentDirectory().getPath() + "/" + parameters.get(0));
            }
        }
    }
}