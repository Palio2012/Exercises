package entities;

public class Account {

    private static int accountNumber;
    private String holder;
    private double balance;


    public Account () {
    }
    public Account(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance (double amount) {
        balance += amount;
    }

    public void withdrawBalance (double amount) {
        balance += - amount - 5;
    }

    public String toString () {
        return "Account " +
                accountNumber +
                ", Holder: " +
                holder + ", Balance: $ " +
                String.format("%.2f", balance);
    }
}
