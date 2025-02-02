public class avrage {
    public static void main(String[] args) {
        int[] ages = {56,78,90,95,23,78};

        float avrage,sum =0;
        int length = ages.length;

        for(int age : ages){
            sum += age;
        }

        avrage = sum / length;

        System.err.println("The average age is "+avrage);
    }
}