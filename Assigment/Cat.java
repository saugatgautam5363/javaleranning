package Assigment;

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
