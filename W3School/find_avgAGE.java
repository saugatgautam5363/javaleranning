public class find_avgAGE {

    public static void main(String[] args) {
        int ages[] = {45,67,89,78,89};

        float avg,sum = 0;

        int length = ages.length;

        for(int age : ages){
            sum+=age;
        }

        avg = sum/length;

        System.out.println("This age collection average age is: "+avg);
    }
}