package Laboratory;

public class FleetTest {
    public static void main(String[] args) {
        Fleet flota1= new Fleet(0, 80, 10, 0, 30, 50);
        System.out.println("Consum mediu pe flota1: "+ flota1.averageConsumption());
    }
    
}
