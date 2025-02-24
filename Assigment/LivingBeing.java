package Assigment;

public abstract class LivingBeing {
    public String name;
    public int legs = 2;

    public LivingBeing(String name) {
        this.name = name;
    }

    public LivingBeing() {
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}