package Laboratory;

public class CopyMachine extends OfficeAssistanceProduct {
    private static int VAT = 20;

    public CopyMachine(int code, long costPrice) {
        super(code, costPrice);

    }

    public static void setVAT(int vat) {
        VAT = vat;
    }

    public long computeSellingPrice() {
        super.setCommision(10);
        long price = (this.costPrice * VAT / 100) + this.costPrice + (super.getCommision() * this.costPrice /100);
        return price;
    }
    
}
