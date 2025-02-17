package java;

import java.util.Random;

public class hello {
    public static void main(String[] args) {
        String[] name = {"saugat","santosh","sandesh"};
    Random rand = new Random();
    int randomIndex = rand.nextInt(name.length);
    System.out.println("Random name: " + name[randomIndex]);
    }
}
  