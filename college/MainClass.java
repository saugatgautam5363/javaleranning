public class MainClass {
    public static void main(String[] args) {
        Human human = new Human("Saugat");
        Dog buddy = new Dog("Buddy", DogBreed.GOLDEN_RETRIEVER);
        Cat whiskers = new Cat("Whiskers", CatType.PERSIAN_CAT);
        Eagle eagle = new Eagle("Eagle");

        human.eat();
        human.sleep();
        human.walk();

        eagle.walk();
        eagle.eat();
        eagle.sleep();

        buddy.eat();
        System.out.println(whiskers.getDetails());
        System.out.println(buddy.getDetails());
    }
}
// Abstract class representing any living being
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

// Enum representing different dog breeds
public enum DogBreed {
    GOLDEN_RETRIEVER, GERMAN_SHEPHERD, BULLDOG, POMERANIAN
}

// Dog class extending LivingBeing
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

// Enum representing different cat types
public enum CatType {
    PERSIAN_CAT, SIAMESE_CAT, MAINE_COON, SPHYNX_CAT
}

// Cat class
public class Cat {
    private String name;
    private CatType type;

    public Cat(String name, CatType type) {
        this.name = name;
        this.type = type;
    }

    public void eat() {
        System.out.println(name + " is eating fish.");
    }

    public String getDetails() {
        return "Cat name: " + name + ", type: " + type;
    }
}

// Eagle class extending LivingBeing
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

// Human class extending LivingBeing
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
