package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (total > balance) return false;
        balance -= total;
        return true;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null) return false;
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (total > balance) return false;
        balance -= total;
        receiver.balance += amount;
        return true;
        }
}
