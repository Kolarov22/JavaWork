public class Loan extends Person{
    
    private int id;
    private double ammount;

    public Loan(int id, double ammount, String name){
        super(name);
        this.id = id;
        this.ammount = ammount;
    }

    public int getId(){
        return id;
    }

    public double getAmmount(){
        return ammount;
    }

    public void increaseAmmount(double added){
        this.ammount += added;
    }

    public String toString(){
        return "/nLoan with id: " + this.id + " and ammount: " + this.ammount;
    }

    
}
