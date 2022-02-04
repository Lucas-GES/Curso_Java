package src.entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
    private static final double tax = 5.00;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositAccount(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void depositAccount(double deposit){
        accountBalance += deposit;
    }

    public void withdrawAccount(double withdraw){
        accountBalance -= withdraw + tax;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: " + accountHolder
                + ", Balance: $ "
                + String.format("%.2f%n",accountBalance);
    }
}
