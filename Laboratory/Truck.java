package Laboratory;

public class Truck extends Vehicle{

    public Truck(double price, String name, String country){
        this.baseprice = price;
        this.name = name;
        this.country = country;

    }

    public double computeRoadTax() {
        return (0.05 * this.baseprice);
    }
}
