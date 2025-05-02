import java.io.File;
import java.io.IOException;

public class FileServiceImpl {


    public void writeFile(String content){

        try{
            File file = new File("Text.txt");
            if(!file.exists()){
                System.out.println("File is not exists!!");
                file.createNewFile();
            }else {
                System.out.println("File exists!!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error Writing file");
        }
    }
}
