import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
    public static void main(String[] args) {

        try {
            Student student = new Student(101, "Saugat");

            FileOutputStream file = new FileOutputStream("example.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(student);

            outputStream.close();
            file.close();

            System.out.println("Object has been serialized successfully.");
        } catch (Exception e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
