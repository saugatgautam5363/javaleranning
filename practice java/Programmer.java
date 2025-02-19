class StudentProgrammer{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Programmer {
    public static void main(String[] args) {
        StudentProgrammer student = new StudentProgrammer();
        student.setName("Saugat Gautam");

        System.out.println("Name : "+student.getName());
    }
}
