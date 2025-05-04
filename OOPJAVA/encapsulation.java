
class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Saugat gautam");
        student.setAge(18);

        System.out.println("Name: "+student.getName());
        System.out.println("Age: " + student.getAge());
    }
}