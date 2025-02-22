abstract class Bank {
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void checkBalance() {
        System.out.println("Checking balance...");
    }
}

class MyBank extends Bank {
    private double balance = 5000;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        }
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Bank myAccount = new MyBank(); 
        myAccount.deposit(3000);
        myAccount.withdraw(1000);
        myAccount.checkBalance();
    }
}
