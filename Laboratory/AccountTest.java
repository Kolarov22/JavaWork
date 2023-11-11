package Laboratory;

public class AccountTest {
    public static void main(String[] args) {
        Account account1= new Account("RO34382293933", "Andrei", 30000);
        Account account2= new Account("RO42ZB2392392", "Radu", 3000);
        account1.processDeposit(2000);
        account2.processCheck(1500);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
    
}
