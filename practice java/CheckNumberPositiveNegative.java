import java.util.Scanner;
public class CheckNumberPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("enter the number: ");
        int number = scanner.nextInt();

        if(number<0){
            System.out.println(number+" number is negative number");
        }if (number>=1) {
            System.out.println(number+" number is positive number");
        }if(number==0){
            System.out.println(number+" number is zero");
        }

        scanner.close();
    }
}
