// BankDemo.java

// Demo class to test the BankAccount and SavingsAccount classes
public class BankDemo {
    public static void main(String[] args) {
        // Create a regular bank account
        BankAccount account1 = new BankAccount("1001");
        System.out.println("Initial balance of account1: $" + account1.checkBalance());
        account1.deposit(1000);
        account1.withdraw(500);
        System.out.println("Current balance of account1: $" + account1.checkBalance());

        // Create a savings account with interest rate
        SavingsAccount account2 = new SavingsAccount("2001", 3.5);
        System.out.println("\nInitial balance of account2: $" + account2.checkBalance());
        account2.deposit(2000);
        account2.addInterest();
        System.out.println("Current balance of account2: $" + account2.checkBalance());
    }
}
