public class Main1 {
    public static void main(String[] args) {
        First1 f = new First1();
        Second s = new Second(f,"welcome");
        Second s1 = new Second(f,"new");
        Second s3 = new Second(f,"Program");
    }
}
