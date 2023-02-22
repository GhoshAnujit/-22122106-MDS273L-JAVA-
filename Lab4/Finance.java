import java.util.ArrayList;
import java.util.Scanner;

public class Finance {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private ArrayList<String> transactions = new ArrayList<String>();
    
    // Initialize the customer with account number, name, and initial balance
    public void initialize(int acctNumber, String acctHolderName, double initialBalance) {
        accountNumber = acctNumber;
        accountHolderName = acctHolderName;
        accountBalance = initialBalance;
        transactions.add("Initial balance: " + initialBalance);
    }
    
    // Deposit money into the account and add transaction to list
    public void deposit(double amount) {
        accountBalance += amount;
        transactions.add("Deposit: " + amount);
    }
    
    // Withdraw money from the account, add transaction to list, and deduct transaction fee
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds");
        } else {
            accountBalance -= (amount + 0.50);
            transactions.add("Withdraw: " + amount);
        }
    }
    
    // Print all transactions in the list
    public void printTransactions() {
        System.out.println("Transactions:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
    
    // Print account summary including account number, account holder name, and account balance
    public void printSummary() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }
    
    // Main method to drive the menu interface
    public static void main(String[] args) {
        Finance account = new Finance();
        Scanner input = new Scanner(System.in);
        int option = 0;
        account.initialize(12345, "John Smith", 1000.00);
        while (option != 5) {
            System.out.println("Menu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter option number: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful");
                    break;
                case 3:
                    account.printTransactions();
                    break;
                case 4:
                    account.printSummary();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        input.close();
    }
}