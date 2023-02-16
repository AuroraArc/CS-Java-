public class BankAccount {

    private double balance;

    public static final int OVERDRAFT_LIMIT = 100;

    /**
     * Creates a new bank account with the given balance.
     * @param balance the initial balance of the account
     */
    public BankAccount(double balance) {
        assert balance >= 0: "Initial balance cannot be negative";
        this.balance = balance;
    }

    /**
     * Returns the current balance of the account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits the given amount into the account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        assert amount > 0: "Amount must be positive"; // precondition is that amount is greater than 0
            balance += amount; // postcondition is that balance will be increased by amount
    }

    /**
     * Withdraws the given amount from the account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        assert amount > 0: "Amount must be positive";
        assert amount <= balance + OVERDRAFT_LIMIT: "Amount cannot exceed more than balance + OVERDRAFT_LIMIT"; // precondition is that amount is less than the balance plus the overdraft limit and that the amount is greater than 0
        balance -= amount; // postcondition is that balance will be decreased by amount
    }
}