package oop;

class Car {
    String brand;
    int speed;

    // Default Constructor
    Car() {
        this.brand = "Tesla";
        this.speed = 150;
    }

    // Parameterized Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Car brand is " + brand + " and speed is " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        defaultCar.display();

        Car customCar = new Car("BMW", 180);
        customCar.display();
    }
}
