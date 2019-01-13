import Source.ConfigReader;
import Source.Values;
import java.io.*;

public class Application {
    static BufferedReader reader;
    static BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        new ConfigReader();
        Boolean isInConsole = (args.length == 0) ? false: (args[0].equals("-"));

        if (isInConsole){
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(Calculate());
            reader.close();
        }else{
            FileReader fileReader = new FileReader(ConfigReader.inputFilePath);
            FileWriter fileWriter = new FileWriter(ConfigReader.outputFilePath);
            reader = new BufferedReader(fileReader);
            writer = new BufferedWriter(fileWriter);
            writer.write(Calculate());
            reader.close();
            writer.close();
        }
    }

    public static String Calculate() throws IOException {
        String inputString;
        String[] inputValues;
        inputString = reader.readLine();
        reader.close();
        inputValues = inputString.split("[ ]");
        return new Values(inputValues).doOperation();
    }
}
