package Assigment;
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
