abstract class Vichal{
    abstract void start();

    void stop(){
        System.out.println("Vichal are stopped");
    }
}

class Car extends Vichal{
    void start(){
        System.out.println("Car start With key.");
    }
}
class Bike extends Vichal{
    void start(){
        System.out.println("Bike start with key.");
    }
}


public class abstractExample1 {
    public static void main(String[] args) {
        Vichal car = new Car();
        car.start();
        car.stop();
        System.out.println("-------------------------");
        Vichal bike = new Bike();
        bike.start();
        bike.stop();
    }    
}