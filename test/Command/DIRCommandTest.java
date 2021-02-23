package Command;

import Filesystem.Drive;
import Invoker.CommandInvoker;
import Writer.IOutputWriter;
import org.junit.Test;

import static org.junit.Assert.*;

public class DIRCommandTest {

    private Drive drive;
    private IOutputWriter writer;
    private DIRCommand dirCommand;
    private final String excpected = "Dieses Verzeichnis Existiert nicht";
    private CommandInvoker invoker;

    @Test
    public void testDirCommand() throws Exception {

    }
}