package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Writer.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.*;
public class DELCommandTest {

    @Test
    public void execute() {

        //Arrange
        //--- Variables
        TestOutputWriter writer;
        Drive drive;
        Directory rootDir;
        Directory dir;

        writer = new TestOutputWriter();
        drive = new Drive("TestDrive", "C");
        rootDir = new Directory("sys", "C:\\");
        dir = new Directory("cec", "C:\\sys");
        dir.setPath(rootDir.getPath());


        //Act


        //Assert
        //assertEquals("Das File mit dem namen "+fileName+ " wurde gelöscht", TestOutputWriter.getOutput());
    }
}