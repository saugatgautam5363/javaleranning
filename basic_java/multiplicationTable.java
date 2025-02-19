// package basic_java;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication table number ");
        int number = scanner.nextInt();

        int i = 1;
        while (i<=10) {
            System.out.println(number +" X "+i+ " = "+number*i);
            i++;
        }

        scanner.close();
    }
}
