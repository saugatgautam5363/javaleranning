import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("example.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            Student student = (Student) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("Student Roll No: " + student.rollNo);
            System.out.println("Student name: " + student.name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
