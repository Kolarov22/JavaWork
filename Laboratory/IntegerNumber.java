package Laboratory;

public class IntegerNumber implements Number {
    private int value;

    public IntegerNumber() {
        this.value = 0;
    }

    public IntegerNumber(int value) {
        this.value = value;
    }

    public Number add(Number o) {
        if (o.getClass() == this.getClass()) {
            IntegerNumber obj = (IntegerNumber) o;
            return new IntegerNumber(obj.getValue() + this.getValue());
        }
        System.out.println("Cannot add different types");
        return new IntegerNumber();

    }

    public Number subtract(Number o) {
        if (o.getClass() == this.getClass()) {
            IntegerNumber obj = (IntegerNumber) o;
            return new IntegerNumber(this.getValue() - obj.getValue());
        }
        System.out.println("Cannot subtract different types");
        return new IntegerNumber();
    }

    public int compareTo(Object o) {
        try {
            IntegerNumber obj = (IntegerNumber) o;
            if (this.getValue() > obj.getValue())
                return 1;
            else if (this.getValue() < obj.getValue())
                return -1;
            else
                return 0;
        } catch (Exception e) {
            return 0;
        }

    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return this.value + "";
    }
    
}
