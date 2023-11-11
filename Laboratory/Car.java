package Laboratory;

public class Car {
    private double startKm;
    private double endKm;
    private double liters;
        public Car(double startOdo, double endOdo, double litersUsed){
            this.startKm= startOdo;
            this.endKm= endOdo;
            this.liters= litersUsed;

        }
        public double computeConsumption(){
            double consum;
            consum=(liters/(endKm-startKm))*100;
            return consum;

        }
       
}
