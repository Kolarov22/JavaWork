package Laboratory;

public class RealNumber implements Number {
    private double value;

    public RealNumber() {
        this.value = 0;
    }

    public RealNumber(double value) {
        this.value = value;
    }

    public Number add(Number o) {
        if (o.getClass() == this.getClass()) {
            RealNumber obj = (RealNumber) o;
            return new RealNumber(obj.getValue() + this.getValue());
        }
        System.out.println("Cannot add different types");
        return null;

    }

    public Number subtract(Number o) {
        if (o.getClass() == this.getClass()) {
            RealNumber obj = (RealNumber) o;
            return new RealNumber(this.getValue() - obj.getValue());
        }
        System.out.println("Cannot subtract different types");
        return null;
    }

    public int compareTo(Object o) {
        try {
            RealNumber obj = (RealNumber) o;
            if (this.getValue() > obj.getValue())
                return -1;
            else if (this.getValue() < obj.getValue())
                return 1;
            else
                return 0;
        } catch (Exception e) {
            return 0;
        }

    }

    public double getValue() {
        return this.value;
    }

    public String toString() {
        return this.value + "";
    }
    
}
