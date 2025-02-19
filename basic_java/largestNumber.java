// package basic_java;

import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the frist number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
int largest;
        if(num1 > num2 && num1 > num3){
            largest = num1;
        } else if(num2 > num1 && num2 > num3){
            largest = num2;
        }else{
            largest = num3;
        }

        System.out.println("The largest number is "+largest);

        scanner.close();
    }
}
