class Car{
    private String brand;
    private int speed;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Car  car = new Car();
        car.setBrand("Toyota");

        System.out.println("The car brand name is: "+car.getBrand());
    }
}
