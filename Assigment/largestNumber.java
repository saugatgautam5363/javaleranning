package Assigment;
import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the frist number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the seccond number: ");
        int number2 = scanner.nextInt();
        System.out.printf("Enter the third number: ");
        int number3 = scanner.nextInt();
int largestNumber;
        if(number1>number2 && number1>number3){
            largestNumber = number1;
        }else if(number2>number1 && number2>number3){
            largestNumber = number2;
        }else{
            largestNumber = number3;
        }
        System.out.println("The largest number is: "+largestNumber);

        scanner.close();
    }
}
