import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
     String name;

    Student(int rollNo,String name){
        this.name = name;
        this.rollNo = rollNo;
    }
}
