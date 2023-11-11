package Portfolio;

public class Portfolio{
    private int noShares=0;
    private Share[] shares= new Share[100];
    public void addShare(Share s){
        this.shares[noShares]=s;
        this.noShares++;

    }


    
    public double computeSum(){
        double sum=0;
        for(int i=0; i<noShares; i++)
            sum+=shares[i].value;
        return sum;     

    }
}

