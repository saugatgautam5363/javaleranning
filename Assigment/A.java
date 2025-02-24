package Assigment;
class Animal {
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("This mammal is walking.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class A {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.walk(); 
        dog.bark(); 
    }
}
