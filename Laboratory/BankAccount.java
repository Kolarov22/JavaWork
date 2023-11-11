package Laboratory;

import java.util.Calendar;
import java.util.Scanner;

public class BankAccount {
    private int id;
    private double balance;
    private String owner;
    private static int idCurrentAccount = 1;

    private static Scanner key = new Scanner(System.in);

    public BankAccount(String owner) {
        this.balance = 0;
        this.owner = owner;
        this.id = this.idCurrentAccount;
        this.idCurrentAccount++;
    }

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.id = idCurrentAccount;
        idCurrentAccount++;
    }

    public void deposit(double depositSum) {
        this.balance += depositSum;
    }

    public void withdraw(double withdrawSum) {
        int c;
        do {
            c = 1;
            if (withdrawSum > this.balance) {
                System.out.println("Insufficient fonds");
                c = 0;
                System.out.println("Insert a viable value");
                withdrawSum = key.nextDouble();
            } else {
                this.balance -= withdrawSum;
                System.out.println("you withdrawn " + withdrawSum + " the current balance is " + this.balance);
            }
        } while (c == 0);
    }

    public void setBalance(int x) {
        this.balance += x;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getId() {
        return String.valueOf(this.id);
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return "The account has the id: " + this.id + ", current balance is: " + this.balance;
    }

}