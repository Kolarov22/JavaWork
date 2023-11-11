package Laboratory;

public class TestAccount2 {
    public static void main(String[] args) {
        SavingsAccount savings1 = new SavingsAccount("Andrei", 5000, 5);
        SavingsAccount savings2 = new SavingsAccount("Horia", 200, 10);
        savings1.applyInterest();
        savings2.applyInterest();
        System.out.println(savings1.toString());
        System.out.println(savings2.toString());
    }
   

}
