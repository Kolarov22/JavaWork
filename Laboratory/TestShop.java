package Laboratory;
import java.util.ArrayList;
public class TestShop {
    public static void main(String[] args) {
        OfficeAssistanceProduct array1[] = new OfficeAssistanceProduct[5];
        OfficeAssistanceProduct printer1 = new Printer(38282, 300);
        OfficeAssistanceProduct printer2 = new Printer(38282, 300);
        OfficeAssistanceProduct copymachine = new CopyMachine(29405, 350);
        OfficeAssistanceProduct lowend = new Computer(59202, 500);
        OfficeAssistanceProduct highend = new Computer(53202, 2500);
        array1[0] = printer1;
        array1[1] = printer2;
        array1[2] = copymachine;
        array1[3] = lowend;
        array1[4] = highend;
        for (int i=0; i < array1.length; i++) 
            System.out.println(array1[i].computeSellingPrice());
        

        ArrayList<OfficeAssistanceProduct> products = new ArrayList<OfficeAssistanceProduct>();
        products.add(printer1);
        products.add(printer2);
        products.add(copymachine);
        products.add(lowend);
        products.add(highend);
        for (OfficeAssistanceProduct product : products) {
            System.out.println(product.computeSellingPrice());
        }
            

    }
    
}
