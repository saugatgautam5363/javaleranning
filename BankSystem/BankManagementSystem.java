package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class Customer {
    private String name;
    private String email;
    private ArrayList<Account> accounts;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(long accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}

class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }
        return null;
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail());
        }
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Add a customer
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, email);
        bank.addCustomer(customer);

        // Add an account for the customer
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(123456789L, initialBalance);
        customer.addAccount(account);

        // Perform some operations
        account.deposit(500);
        account.withdraw(200);

        // Display customer details
        bank.displayCustomers();

        scanner.close();
    }
}
