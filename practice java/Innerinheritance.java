class car{
    String Color;
}
class Brand extends car{

}

public class Innerinheritance {
    public static void main(String[] args) {
        Brand BMW = new Brand();
        BMW.Color = "Silver";

        System.out.println(BMW.Color);
    }
}