package Command;

import Console.Console;
import Factory.CommandFactory;
import Filesystem.Directory;
import Filesystem.Drive;
import TestWriter.TestOutputWriter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DELCommandTest {

    @Test
    public void execute() {

        //Arrange
        //--- Variables
        TestOutputWriter testOutputWriter;
        Drive drive;
        Directory rootDir;
        Directory dir;
        List<String> params = new ArrayList<>();

        testOutputWriter = new TestOutputWriter();
        drive = new Drive("TestDrive", "C");
        rootDir = new Directory("sys", "C:\\");
        dir = new Directory("cec", "C:\\sys");

        params.add("sys");

        drive.setRootDirectory(rootDir);

        rootDir.getFileSystemLists().add(dir);

        drive.getCurrentDirectory().getFileSystemLists().add(rootDir);

        drive.setCurrentDirectory(rootDir);

        Command cmd = CommandFactory.getCommand("del");
        cmd.setParameters(params);
        cmd.execute(testOutputWriter, drive);
        //Act


        //Assert
        Assert.assertEquals("Das File mit dem namen sys wurde gelöscht", testOutputWriter.getOutput());
        //assertEquals("Das File mit dem namen "+fileName+ " wurde gelöscht", TestOutputWriter.getOutput());
    }
}