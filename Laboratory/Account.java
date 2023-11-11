package Laboratory;
import java.util.Scanner;
public class Account {
    protected int id;
    protected double balance;
    protected String owner;
    private static int idCurrentAccount = 1;

    public Account(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.id = idCurrentAccount;
        this.idCurrentAccount++;
        
    }

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0;
        this.id = idCurrentAccount;
        this.idCurrentAccount++;
       
    }

    public void deposit(double sum) {
        this.balance += sum;
    }

    public void withdraw(double suma) {
        if (suma > this.balance)
            {   System.out.println("Sorry, the sum couldn't be withdrawn, please check your balance");
                Scanner input = new Scanner(System.in);
                System.out.println("Choose the sum you want to withdraw: ");
                this.withdraw(input.nextDouble());
            }    

        else 
            this.balance -= suma;
            System.out.println("The sum has been withdrawn successfully");    
    }

    public String getId() {
        return "Your id is: " + this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return "The account of " + this.owner + " (id: " + this.id + ") has the balance: " + this.balance;
    }


}
