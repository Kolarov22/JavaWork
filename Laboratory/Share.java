package Portfolio;

import Company;

public class Share {
    protected double value;
    private Company company;
    public Share(double value, Company company){
        this.value= value;
        this.company= company; 

    }
    
}
