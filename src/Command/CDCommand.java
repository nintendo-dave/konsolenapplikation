package Command;
import Filesystem.Directory;
import Filesystem.Drive;
import TestWriter.IOutputWriter;
public class CDCommand extends Command {
    @Override
    public void execute(IOutputWriter outputWriter, Drive drive) {
        if(parameters.get(0).equals("\\") || parameters.get(0).equals("/")){
            System.out.println("Something1");
            drive.getCurrentDirectory().setPath("C:");
            System.out.println(drive.getCurrentDirectory().getPath());
        }
        else if(parameters.get(0).equals("..")) {
            System.out.println("Something2");
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
            System.out.println(drive.getCurrentDirectory().getPath());
        }
        else if(parameters.get(0).startsWith("..")){
            System.out.println("Something3");
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
                System.out.println("Something4");
                String[] array1 = drive.getCurrentDirectory().getPath().split("/");
                String path = "";
                for (int i = 0; i < array1.length - array.length; i++) {
                    path += array1[i];
                }
                drive.setCurrentDirectory(new Directory("name", path));
            }
            System.out.println(drive.getCurrentDirectory().getPath());
        }
        else if(parameters.get(0).matches("^[a-zA-Z1-9äüö/]+")){
            System.out.println("5");
            if(parameters.get(0).split(" ").length != 0){
                drive.getCurrentDirectory().setPath(drive.getCurrentDirectory().getPath() + "/" + parameters.get(0));
            }
            System.out.println(drive.getCurrentDirectory().getPath());
        }
    }
}