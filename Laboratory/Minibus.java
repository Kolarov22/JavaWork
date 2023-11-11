package Laboratory;

public class Minibus extends Vehicle {

    public Minibus(double price, String name, String country){
        this.baseprice = price;
        this.name = name;
        this.country = country;

    }

    public double computeRoadTax() {
        return (0.03 * this.baseprice);
    }
}
