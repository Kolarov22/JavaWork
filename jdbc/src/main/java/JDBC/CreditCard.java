package JDBC;

public class CreditCard {
    private int id;
    private String IBAN;
    private double amount;

    private int owner;


    public CreditCard(String IBAN, double amount) {
        this.IBAN = IBAN;
        this.amount = amount;
    }

    public CreditCard(int id, String IBAN, double amount, int owner) {
        this.id = id;
        this.IBAN = IBAN;
        this.amount = amount;
        this.owner = owner;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "JDBC.CreditCard{" +
                "IBAN='" + IBAN + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
