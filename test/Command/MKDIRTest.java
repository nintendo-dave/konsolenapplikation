package Command;

import Configurator.Configurator;
import Console.Console;
import Filesystem.Directory;
import Filesystem.Drive;
import Writer.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

//Authors: Luca v.S., David B.
public class MKDIRTest {

	//--- Variables
	TestOutputWriter writer;
	Drive drive;
	Directory rootDir;
	Directory dir;

	//--- Test Methods
	private void prepEnvironment(){
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

		//create Console
		Console console = new Console(new Configurator());
		console.start();
	}

	@Test
	public void testDirectoryRedundancy(){
		prepEnvironment();
		System.out.println("Environment set up");
		//create test-directory
		Directory dir2 = new Directory("bobs_files", "C:\\sys\\bob");

		//create command
		MKDIRCommand cmd = new MKDIRCommand();
		cmd.execute(writer, drive);
		ArrayList<String> params = new ArrayList<>();
		params.add("f");
		cmd.setParameters(params);

	}
}
