package Command;

import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.ConsoleOutputWriter;
import Writer.IOutputWriter;
import Writer.TestOutputWriter;
import org.junit.Test;

import static org.junit.Assert.*;

public class DIRCommandTest {

    private Drive drive;
    private IOutputWriter writer;
    private DIRCommand dirCommand;
    private final String excpected = "Dieses Verzeichnis Existiert nicht";
    private CommandInvoker invoker;
    private TestOutputWriter outputWriter;

    @Test
    public void testDirCommand() throws Exception {


        assertEquals(excpected, );
    }
}