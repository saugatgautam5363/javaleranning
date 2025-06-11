import java.io.Serializable;

public class Employ implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    double salary;
    Employ(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
