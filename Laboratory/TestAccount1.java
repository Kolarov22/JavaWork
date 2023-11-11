package Laboratory;

public class TestAccount1 {
    public static void main(String[] args) {
        Account normal1 = new Account(1000, "John");
        Account normal2 = new Account( 500, "Virgil");
        SavingsAccount savings1 = new SavingsAccount("Andrei", 5000, 5);
        SavingsAccount savings2 = new SavingsAccount("Horia", 200, 10);
        System.out.println(normal1.toString());
        System.out.println(normal2.toString());
        System.out.println(savings1.toString());
        System.out.println(savings2.toString());
        System.out.println();
        Account[] array = new Account[4];
        array[0] = normal1;
        array[1] = normal2;
        array[2] = savings1; 
        array[3] = savings2;
        for(int i=0; i<4; i++){
            if(array[i] instanceof SavingsAccount){
                SavingsAccount apply = new SavingsAccount(" ", 0, 0);
                apply = (SavingsAccount) array[i];
                apply.applyInterest();

            }
               
        }
        System.out.println(normal1.toString());
        System.out.println(normal2.toString());
        System.out.println(savings1.toString());
        System.out.println(savings2.toString());
        System.out.println();
        normal1.withdraw(100);
        System.out.println(normal1.getBalance());


    
    }
}