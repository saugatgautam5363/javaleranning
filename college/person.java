abstract class Person{
    abstract void walk();


    static class Walk extends Person{
        void walk(){
            System.out.println("Human is walking");
        }
    }
}


public class person {
    public static void main(String[] args) {
        Person man = new Person.Walk();
        man.walk();
    }
}
