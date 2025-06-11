import java.io.File;
import java.io.IOException;

class FileCreate {
    public static void main(String[] args) {


        try {
            File file = new File("employ.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}