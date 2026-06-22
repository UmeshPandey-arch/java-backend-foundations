public class UserAccount {
    // 1. Private fields cannot be accessed directly from outside this class
    private String username;
    private double balance;

    // Constructor
    public UserAccount(String username, double initialBalance) {
        this.username = username;
        // Enforce data integrity during creation
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("⚠️ Warning: Initial balance cannot be negative. Set to $0.0");
        }
    }

    // 2. Public Getter: Allows safe, read-only access to username
    public String getUsername() {
        return username;
    }

    // Public Getter: Allows safe, read-only access to balance
    public double getBalance() {
        return balance;
    }

    // 3. Controlled Setter/Business Method: Enforces system rules
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("💰 Successfully deposited $" + amount);
        } else {
            System.out.println("❌ Error: Deposit amount must be positive!");
        }
    }

    // Another controlled method: Safe withdrawal
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Error: Withdrawal amount must be positive!");
        } else if (amount > this.balance) {
            System.out.println("❌ Error: Insufficient funds for withdrawal!");
        } else {
            this.balance -= amount;
            System.out.println("💸 Successfully withdrew $" + amount);
        }
    }
}