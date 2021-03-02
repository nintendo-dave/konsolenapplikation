package Command;

import Filesystem.Drive;
import Invoker.CommandInvoker;
import TestWriter.IOutputWriter;
import TestWriter.TestOutputWriter;
import org.junit.Test;

public class DIRCommandTest {

    private Drive drive;
    private IOutputWriter writer;
    private DIRCommand dirCommand;
    private final String excpected = "Dieses Verzeichnis Existiert nicht";
    private CommandInvoker invoker;
    private TestOutputWriter outputWriter;

    @Test
    public void testDirCommand() throws Exception {


        //assertEquals(excpected, );
    }
}