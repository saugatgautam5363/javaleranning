import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize1 {
    public static void main(String[] args) {
        try {
        FileInputStream file = new FileInputStream("employ.txt");
            ObjectInputStream ois = new ObjectInputStream(file);

           Employ employ = (Employ) ois.readObject();
            ois.close();
            file.close();
            System.out.println("Name: "+employ.name);
            System.out.println("Age: "+employ.age);
            System.out.println("Salary: "+employ.salary);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
