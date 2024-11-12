import java.util.Scanner;

// Abstract class representing a bank account
abstract class BankAccount {
    private String accountHolderName;
    private double balance;
    private final String bankName = "Codingal"; // Name of the bank

    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public abstract void displayAccountDetails();
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, double initialDeposit) {
        super(accountHolderName, initialDeposit);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Bank: " + getBankName());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Account Type: Savings");
        System.out.println("Balance: " + getBalance());
    }
}

// Main class
public class acp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message and account creation
        System.out.println("Welcome to Codingal Bank!");
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountHolderName, initialDeposit);
        System.out.println("Account created successfully!\n");

        // Banking services menu
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Banking Services Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Codingal Bank services!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
