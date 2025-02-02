import java.util.Scanner;
public class oddeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
            scanner.close();
        }
    }
}