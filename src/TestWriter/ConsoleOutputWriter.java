package TestWriter;

public class ConsoleOutputWriter implements IOutputWriter {
    @Override
    public void print(String output) {
        System.out.print(output);
    }

    @Override
    public void printLine(String output) {
        System.out.println(output);
    }
}
