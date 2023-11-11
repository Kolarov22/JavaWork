package Laboratory;

public abstract class OfficeAssistanceProduct {
    protected int code;
    private static int commisionPercent;
    protected long costPrice;

    public OfficeAssistanceProduct(int code, long costPrice) {
        this.code = code;
        this.costPrice = costPrice;
    }

    public static void setCommision(int percent) {
        commisionPercent = percent;
    }

    public int getCommision(){
        return commisionPercent;
    }

    public String toString() {
        return "The code is: " + this.code + " commision: " + commisionPercent + " with a cost of: " + this.costPrice;

    }

    public abstract long computeSellingPrice();
        
    
    


    
}
