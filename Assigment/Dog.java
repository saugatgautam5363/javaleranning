package Assigment;

public class Dog {
    private String name;
    private DogBreed breed;

    public Dog(String name, DogBreed breed) {
        this.name = name;
        this.breed = breed;
    }

    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public String getDetails() {
        return "Dog name: " + name + ", breed: " + breed;
    }
}
