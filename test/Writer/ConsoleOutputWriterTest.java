package Writer;

import org.junit.Test;

public class ConsoleOutputWriterTest {

	//--- Variables
	private String output;

	@Test
	public void print(String output) {
		this.output = output;
	}

	@Test
	public void printLine(String output) {
		this.output = output;
	}

	public String getOutput(){
		return output;
	}
}