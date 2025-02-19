abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("This animal walk in 4 legs");
    }

    class Chicken extends Animal{
        public void walk(){
            System.out.println("chicken walk in 2 legs");
        }
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
