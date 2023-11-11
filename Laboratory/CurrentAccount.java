package Laboratory;

import java.util.Calendar;

public class CurrentAccount extends BankAccount {
    private int transactionNo;
    private final int FREE_TRANSACTIONS = 3;
    private final double TRANSACTION_COST = 5;

    public CurrentAccount(String owner, double balance, int transNr) {
        super(balance, owner);
        this.transactionNo = transNr;
    }

    private void dischargeExpenses() {
        if (transactionNo > FREE_TRANSACTIONS)
            super.withdraw(TRANSACTION_COST * (transactionNo - FREE_TRANSACTIONS));
    }

    public String toString() {
        return "Current account:  " + super.toString();
    }

    public void deposit(double sum) {
        super.deposit(sum);
        this.transactionNo++;
    }

    public void withdraw(double sum) {
        super.withdraw(sum);
        this.transactionNo++;
    }

    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayMonth = cal.get(Calendar.MONTH);
        if (currentMonth != nextDayMonth) {
            dischargeExpenses();
            transactionNo = 0;
        }
    }
}