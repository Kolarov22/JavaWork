package Homeworks;
import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int nr){
        boolean prime=true;
        if (nr < 2)
            return false;
        for(int i=2;i<=nr/2;i++){
            if(nr%i==0)
                prime=false;
            
        }
        return prime;

    }
    public static void main(String[] args) {
        System.out.print("Introduceti numarul: ");
        int nr=new Scanner(System.in).nextInt();
        if(isPrime(nr)==true)
            System.out.println("Numarul introdus este prim");
        else 
            System.out.println("Numarul introdus nu este prim");        
    }
    
}
