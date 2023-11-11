package Laboratory;

public abstract class Vehicle implements Taxable, Comparable<Vehicle> {
    protected double baseprice;
    protected String name;
    protected String country;


    public String toString(){
       
        String s= "The vehicle has the following information: " + this.getClass() + ", " + this.baseprice + "," + this.name + ", " + this.country + ", " + this.computeTotalTax();
        return s;
    }

    @Override
    public double computeVAT() {
        return (0.19 *this.baseprice);
    }

    @Override
    public abstract double computeRoadTax();

    @Override
    public double computeCostumTax() {
        if( country.equals("Romania"))
            return 0;
        else 
            return (0.1 * this.baseprice);    
        
    }

    @Override
    public double computeTotalTax() {
         double totalsum = this.computeVAT() + this.computeCostumTax() + this.computeRoadTax() + this.baseprice;
         return totalsum;
    }

    public int compareTo(Vehicle c) {
        if (computeTotalTax() == c.computeTotalTax())
            return 0;
        else if (computeTotalTax() > c.computeTotalTax())
            return 1;
        else
            return -1;
    }




    
}
