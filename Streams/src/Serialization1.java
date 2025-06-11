import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization1 {
    public static void main(String[] args) {

        try {
            Employ employ = new Employ("saugat",20,100000.00);
            FileOutputStream file = new FileOutputStream("employ.txt");
            ObjectOutputStream ojs = new ObjectOutputStream(file);

            ojs.writeObject(employ);

            ojs.close();
            file.close();
            System.out.println("Object has been serialized successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
