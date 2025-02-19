class Car{
    String brand;
    int speed;

    public void display(){
        System.out.println("Brand: "+brand +" Speed: "+speed);
    }
}

public class oop {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand ="Toyota";
        car.speed = 123;
        car.display();
    }
}