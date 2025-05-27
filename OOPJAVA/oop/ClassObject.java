package oop;
class Car{
    String brand;
    int speed;

    void showSpeed(){
        System.out.println("Speed "+speed + " km/h");
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 200;
        car.showSpeed();
    }
}
