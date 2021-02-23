package Command;

import Factory.CommandFactory;
import Filesystem.Directory;
import Filesystem.Drive;
import Writer.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.*;

public class VERCommandTest {

	@Test
	public void execute() {

		//--- Variables
		TestOutputWriter writer;
		Drive drive;
		Directory rootDir;
		Directory dir;

		//Create OutputWriter
		writer = new TestOutputWriter();

		//start initializing drive
		drive = new Drive("TESTDRIVE", "C");

		//create root directory of drive
		rootDir = new Directory("sys", "C:\\");
		//create directory in which is tested
		dir = new Directory("bob", "C:\\sys");
		dir.setPath(rootDir.getPath());

		//finish initializing drive
		drive.setRootDirectory(rootDir);
		drive.setCurrentDirectory(dir);

		//create TestOutputWriter
		TestOutputWriter testOutputWriter = new TestOutputWriter();

		//create and execute command
		Command cmd = CommandFactory.getCommand("ver");
		cmd.execute(testOutputWriter, drive);

		//validate test results
		assertEquals("Alpha 0.1", testOutputWriter.getOutput());
	}
}