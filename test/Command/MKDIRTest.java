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

	//--- Test Methods
	@Test
	public void testDirectoryAlreadyExists(){
		//Arrange
		CommandInvoker commandInvoker = new CommandInvoker(writer);

		//Act
		commandInvoker.executeCommand("mkdir bob");

		//Assert
		assertEquals("Ein Unterverzeichnis mit dem Namen "+
				"\"bob\" existiert bereits.", writer.getOutput());

		//for additional debugging
		System.out.println("Actual: \n" + writer.getOutput());

	}

	@Test
	public void testCreateDirectory(){
		//Arrange
		CommandInvoker commandInvoker = new CommandInvoker(writer);

		//Act
		commandInvoker.executeCommand("mkdir newDirectory");

		//Assert
		//loop through rootDir and check for newly created directory 'newDirectory'
		boolean exists = false;
		for(FileSystemItem item : drive.getCurrentDirectory().getFileSystemLists()){
			if (item instanceof Directory && item.getName().equals("newDirectory")) {
				exists = true;
				break;
			}
		}

		assertTrue(exists);
	}
}
