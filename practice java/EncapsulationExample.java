import java.util.Scanner;

class BankAccount {
    private long accountNumber;
    private double balance;
    private String ownerName;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("This balance is invalid! Balance cannot be negative.");
            return; 
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        account.setAccountNumber(123455678);
        System.out.print("Enter the account holder name: ");
        account.setOwnerName(scanner.nextLine());

        System.out.print("Enter the balance: ");
        double inputBalance = scanner.nextDouble();
        account.setBalance(inputBalance);

        scanner.close();

        System.out.println("\n----------- The Bank Details --------------");
        System.out.println("Account Holder Name: " + account.getOwnerName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }
}
