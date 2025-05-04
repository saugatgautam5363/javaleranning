import java.io.FileWriter;
import java.io.IOException;

public class OtherFileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("File1.txt");
            fileWriter.write("this is a saugat file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
