 class Pen {
    String color;
    String Types;  

    public void printColor(){
        System.out.println(this.color);
    }
    public void printTypesOfPen(){
        System.out.println(this.Types);
    }
}

public class oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.Types = "gel";

        Pen pen2 = new Pen();
        pen2.Types = "BallPen";
        pen2.color = "Black";

        pen1.printColor();
        pen1.printTypesOfPen();
        pen2.printColor();
        pen2.printTypesOfPen();
    }
    
}