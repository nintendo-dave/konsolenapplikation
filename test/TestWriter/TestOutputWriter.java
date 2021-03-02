package TestWriter;

public class TestOutputWriter implements IOutputWriter{
	//--- Variables
	private String output;

	//--- Methods
	@Override
	public void print(String output) {
		this.output = output;
	}

	@Override
	public void printLine(String output) {
		this.output = output;
	}

	//--- Getter and Setter
	public String getOutput(){
		return output;
	}
}
