public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Day 2: Encapsulation Test ---");

        // Create a valid account
        UserAccount account = new UserAccount("backend_dev_2026", 150.00);

        // Try to access fields directly (Uncommenting the line below will throw a compiler error!)
        // account.balance = 5000.0;

        // Test business rule validations
        account.deposit(50.0);       // Valid deposit
        account.deposit(-20.0);      // Invalid deposit handled gracefully

        account.withdraw(30.0);      // Valid withdrawal
        account.withdraw(200.0);     // Blocked withdrawal (overdraft protection)

        System.out.println("\nFinal Verified Account Summary:");
        System.out.println("Account Holder: " + account.getUsername());
        System.out.println("Current Balance: $" + account.getBalance());
    }
}