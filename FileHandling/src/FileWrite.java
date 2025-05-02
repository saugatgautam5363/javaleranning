import java.io.FileWriter;
import java.io.IOException;
public class FileWrite{
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, Java file handling!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void write(String helloWorld) {
//    }
}
