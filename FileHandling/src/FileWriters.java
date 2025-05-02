import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriters {
    public static void main(String[] args) {
        try{
            File file = new File("saugat.txt");
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
