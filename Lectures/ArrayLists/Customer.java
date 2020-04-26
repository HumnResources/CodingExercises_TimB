package Lectures.ArrayLists;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double balance = 0.0d;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double deposit) {
        this.name = name;
        updateBalance(deposit);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void newBalance(double amt) {
        updateBalance(amt);
    }

    public boolean noAccount() {
        return this.getName().isBlank() || this.getName().isEmpty();
    }

    private void updateBalance(double amt) {
        this.transactions.add(amt);
        this.balance += amt;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String record = String.format("Name: %s%sBalance: $%s%sTransaction History%s",name,newLine,balance,newLine,newLine);
        if (!transactions.isEmpty())
            for (double transaction:transactions)
                record = record.concat(String.valueOf(transaction)).concat(newLine);
        return record;
    }
}
