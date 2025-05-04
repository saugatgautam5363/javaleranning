import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("saugat.txt");
        if(file.delete()){
            System.out.println("File is delete!!");
        }else {
            System.out.println("File is not found");
        }
    }
}
