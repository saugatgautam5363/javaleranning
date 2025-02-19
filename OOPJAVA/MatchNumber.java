import java.util.Scanner;

class Number {
    int number1;
    int number2;

    public boolean isnumberMatching(int number1) {
        return this.number2 == number1;
    }
}

public class MatchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Number number = new Number();
        System.out.print("Enter the Frist number: ");
        number.number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number.number2 = scanner.nextInt();

        if (number.isnumberMatching(number.number1)) {
            System.out.println("This numbe is Match");
        } else {
            System.out.println("This number is not Match");
        }

        scanner.close();
    }
}
