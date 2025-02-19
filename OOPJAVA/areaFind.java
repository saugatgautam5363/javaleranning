class Area {
    private int l;
    private int b;

    // constructor to initialize values
    Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void getArea() {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}

public class areaFind {
    public static void main(String[] args) {
        Area rectangle = new Area(3,8);
        rectangle.getArea();
    }
}
