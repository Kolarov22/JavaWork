package Laboratory;

public class Bus extends Vehicle {
   public Bus(double price, String name, String country){
        this.baseprice = price;
        this.name = name;
        this.country = country;

    }

    public double computeRoadTax(){
        return (0.04 * this.baseprice);
    }
}
