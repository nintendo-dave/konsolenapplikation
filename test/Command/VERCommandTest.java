package Command;

import Factory.CommandFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class VERCommandTest {

	@Test
	public void execute() {
		Command testVerCommand = CommandFactory.getCommand("ver");

	}
}