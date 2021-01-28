package Command;

import Filesystem.Directory;
import Filesystem.Drive;
import Writer.ConsoleOutputWriterTest;
import org.junit.Test;

import java.util.ArrayList;

//Authors: Luca v.S., David B.
public class MKDIRTest {

	//--- Variables
	ConsoleOutputWriterTest writer;
	Drive drive;
	Directory rootDir;
	Directory dir;

	//--- Test Methods
	private void prepEnvironment(){

		//Create OutputWriter
		writer = new ConsoleOutputWriterTest();

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
	}

	@Test
	public void testDirectoryRedundancy(){
		prepEnvironment();

		//create test-directory
		Directory dir2 = new Directory("bobs_files", "C:\\sys\\bob");

		//create command
		MKDIRCommand cmd = new MKDIRCommand();
		cmd.execute(writer, drive);
		ArrayList params = new ArrayList();
		params.add("");
		cmd.setParameters(new ArrayList<>());


	}
}
