package Command;

import Configurator.Configurator;
import Console.Console;
import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.ConsoleOutputWriterTest;
import org.junit.Test;

public class MKDIRTest {
	@Test
	public void searchDirectoryName(){
		//Create Console
		Console console = new Console(new Configurator());

		//Create OutputWriter
		ConsoleOutputWriterTest writer = new ConsoleOutputWriterTest();

		//start initializing drive
		Drive drive = new Drive("TESTDRIVE", "C");

		//root directory of drive
		Directory rootDir = new Directory("sys", "C:\\");
		//Create directory to be tested
		Directory dir = new Directory("bob", "C:\\sys");
		dir.setPath(rootDir.getPath());

		//finish initializing drive
		drive.setRootDirectory(rootDir);
		drive.setCurrentDirectory(dir);

		//Create Invoker
		CommandInvoker invoker = new CommandInvoker(writer);

	}
}
