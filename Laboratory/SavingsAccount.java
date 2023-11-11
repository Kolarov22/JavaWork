package Laboratory;

import java.util.Calendar;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(String owner, double interestRate) {
        super(owner);
        this.interest = interestRate;
    }

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(balance, owner);
        this.interest = interestRate;
    }

    private void applyInterest() {
        double interestSum = super.getBalance() * interest / 100;
        super.deposit(interestSum);
    }

    public double getInterest() {
        return this.interest;
    }

    public String toString() {
        return "Savings account: " + super.toString() + ", the interest rate is: " + this.interest;
    }

    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayMonth = cal.get(Calendar.MONTH);
        if (currentMonth != nextDayMonth) {
            applyInterest();
        }
    }
}