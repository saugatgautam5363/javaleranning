package Assigment;

public class Human extends LivingBeing {
    Human(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a burger 🍔.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in a cozy bed.");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking on " + legs + " legs.");
    }
}
