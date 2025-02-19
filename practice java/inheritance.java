class Car{
    String brand = "ford";
}
class Model extends Car{

}
public class inheritance {
    public static void main(String[] args) {
        Model model = new Model();
        model.brand = "mastang";

        System.out.println("The car model is "+model.brand);
    }
}
