import java.util.ArrayList;
import java.io.*;


public class Bank {
    
    private ArrayList<Loan> Loans = new ArrayList<>();

    public void addLoan(Loan l){
        Loans.add(l);
    }

    public boolean remove(Loan l) {
        for (Loan i : Loans) {
            if (i.getId() == l.getId()) {
                Loans.remove(i);
                return true;
            }
        }

        return false;
    }

    public Loan find(String name){
        for (Loan i : Loans) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        
    }

    public Loan find(String name, double minAmmount){
        for (Loan i : Loans) {
            if (i.getName().equals(name) && i.getAmmount()>=minAmmount) {
                return i;
            }
        }
    }

    public void printInFile(String fileName){
        try{
            File file = new File(fileName+".txt");
            FileWriter print = new FileWriter(fileName+".txt");
            for(Loan i : Loans){
                print.write(i.toString());
            }
            print.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}