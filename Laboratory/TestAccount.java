package Laboratory;

public class TestAccount {
    public static void main(String[] args) {
        CurrentAccount debit1 = new CurrentAccount("Radu", 2000, 5);
        CurrentAccount debit2 = new CurrentAccount("Andrei", 5000, 10);

        SavingsAccount savings1 = new SavingsAccount("John", 30000, 15);
        SavingsAccount savings2 = new SavingsAccount("Marry", 3000, 10);

        System.out.println(debit1);
        System.out.println(debit2);

        System.out.println();

        System.out.println(savings1);
        System.out.println(savings2);

        System.out.println();

        debit1.endOfMonth();
        debit2.endOfMonth();

        System.out.println(debit1);
        System.out.println(debit2);

        System.out.println();

        savings1.endOfMonth();
        savings2.endOfMonth();

        System.out.println(savings1);
        System.out.println(savings2);
    }
}
