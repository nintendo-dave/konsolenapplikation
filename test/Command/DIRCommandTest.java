package Command;

import Console.Console;
import Filesystem.Directory;
import Filesystem.Drive;
import Filesystem.FileSystemItem;
import Invoker.CommandInvoker;
import TestWriter.TestOutputWriter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//Authors: Luca v.S., David B.
public class DIRCommandTest {

    //--- Variables
    TestOutputWriter writer;
    Drive drive;
    Directory rootDir;
    Directory dir;

    //--- Test Setup

    public void setupEnvironment(){
        //Create OutputWriter
        writer = new TestOutputWriter();

        //start initializing dr§ive
        drive = new Drive("TESTDRIVE", "C");

        //create root directory of drive
        rootDir = new Directory("\\", "C:");
        //create directory in which is being tested
        dir = new Directory("bob", "C:\\");
        dir.setPath(rootDir.getPath());
        rootDir.getFileSystemLists().add(dir);

        //finish initializing drive
        drive.setRootDirectory(rootDir);
        drive.setCurrentDirectory(rootDir);
        Console.setDrive(drive);
        System.out.println(rootDir.getPath());

        //create test-directory
        Directory dir2 = new Directory("bobs_files", "C:\\sys\\bob");
    }

    @Test
    public void showCurrentDirectory(){
        //Arrange
        CommandInvoker commandInvoker = new CommandInvoker(writer);

        //Act
        commandInvoker.executeCommand("dir");

        //Assert


        //for additional debugging
        System.out.println("Actual: \n" + writer.getOutput());
    }
}