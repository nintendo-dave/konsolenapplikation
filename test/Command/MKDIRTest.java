package Command;

import Console.Console;
import Filesystem.Directory;
import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.TestOutputWriter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//Authors: Luca v.S., David B.
public class MKDIRTest {

	//--- Variables
	TestOutputWriter writer;
	Drive drive;
	Directory rootDir;
	Directory dir;

	//--- Test Setup
	@Before
	public void setupEnvironment(){
		//Create OutputWriter
		writer = new TestOutputWriter();

		//start initializing drive
		drive = new Drive("TESTDRIVE", "C");

		//create root directory of drive
		rootDir = new Directory("sys", "C:\\");
		//create directory in which is tested
		dir = new Directory("bob", "C:\\sys");
		dir.setPath(rootDir.getPath());
		rootDir.getFileSystemLists().add(dir);

		//finish initializing drive
		drive.setRootDirectory(rootDir);
		drive.setCurrentDirectory(rootDir);
		Console.setDrive(drive);

		//create test-directory
		Directory dir2 = new Directory("bobs_files", "C:\\sys\\bob");
	}

	//--- Test Methods
	@Test
	public void testDirectoryRedundancy(){
		//create and execute command
		CommandInvoker commandInvoker = new CommandInvoker(writer);
		commandInvoker.executeCommand("mkdir ");

		//validate
		assertEquals("Ein Unterverzeichnis oder eine Datei mit dem Namen "+
				"\"bob\" existiert bereits.", writer.getOutput());

		//print output
		System.out.println("Actual: \n" + writer.getOutput());

	}
}
