package Laboratory;
public class CarTest {
    
    public static void main(String[] args) {
        Car passat = new Car(0, 80, 10);
        Car matiz = new Car(0, 30, 50);
        System.out.println("Consumul passatului este " + passat.computeConsumption() +"L/100KM" );
        System.out.println("Consumul matizului este " + matiz.computeConsumption() + "L/100KM");

    }
}
