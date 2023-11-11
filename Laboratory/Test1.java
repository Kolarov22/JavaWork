package Laboratory;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        
        Vehicle truck1 = new Truck( 30000, "Volvo", "Sweden");
        Vehicle bus1 = new Bus( 10000, "Dacia", "Romania");
        Vehicle minibus1 = new Minibus( 7500, "Renault", "France");


        ArrayList<Vehicle> cars = new ArrayList<>();
        cars.add(truck1);
        cars.add(bus1);
        cars.add(minibus1);

        for (Vehicle c : cars) {

            System.out.println(c);
        }

        System.out.println();

            Collections.sort(cars);

        for (Vehicle c : cars) {

            System.out.println(c);
        }
    }
    
    
    
}
