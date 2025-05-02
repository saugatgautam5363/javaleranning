import java.io.FileWriter;
import java.io.IOException;

public class NewFilewriter {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("saugat.txt")){
            fileWriter.write("Hello,This is a Saugat new File!!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
