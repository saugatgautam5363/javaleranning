package Assigment;


public class Eagle extends LivingBeing {
    Eagle(String name) {
        super(name);
    }



    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps high on cliffs.");
    }

    @Override
    public void walk() {
        System.out.println(name + " hops on " + legs + " legs but prefers flying.");
    }
}

