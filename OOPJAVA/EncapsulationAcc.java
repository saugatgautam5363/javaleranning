import java.util.Scanner;

class Account {
    private String name;
    private String email;
    private long accountNumber;
    private int phoneNumber;
    private float amount;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public boolean isAccountNumberMatching(long userAccountNumber) {
        return this.accountNumber == userAccountNumber;
    }
}

public class EncapsulationAcc {
    public static void main(String[] args) {
        Account account = new Account();
        // Account account1 = new Account(); 
        Scanner scanner = new Scanner(System.in);

        account.setName("Saugat Gautam");
        account.setEmail("Saugatgautam752@gmail.com");
        account.setAccountNumber(123456789L);
        account.setPhoneNumber(9843123);
        account.setAmount(908746.00f);

        System.out.print("Enter your account number: ");
        long userAccountNumber = scanner.nextLong();

        if (account.isAccountNumberMatching(userAccountNumber)) {
            System.out.println("Account Details:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Name: " + account.getName());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Amount: " + account.getAmount());
        } else {
            System.out.println("Account number does not match.");
        }

        scanner.close();
    }
}
