package Laboratory;

public class ComplexNumber implements Number {
    private int a;
    private int b;

    public ComplexNumber() {
        this.a = 0;
        this.b = 0;
    }

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Number add(Number o) {
        if (o.getClass() == this.getClass()) {
            ComplexNumber obj = (ComplexNumber) o;
            return new ComplexNumber(obj.getreal() + this.getreal(), obj.getimaginary() + this.getimaginary());
        }
        System.out.println("Cannot add different types");
        return new ComplexNumber();

    }

    public Number subtract(Number o) {
        if (o.getClass() == this.getClass()) {
            ComplexNumber obj = (ComplexNumber) o;
            return new ComplexNumber(obj.getreal() - this.getreal(), obj.getimaginary() - this.getimaginary());
        }
        System.out.println("Cannot subtract different types");
        return new ComplexNumber();
    }

    public int compareTo(Object o) {
        try {
            ComplexNumber obj = (ComplexNumber) o;
            if (this.getreal() > obj.getreal())
                return 1;
            else if (this.getreal() < obj.getreal())
                return -1;
            else if (this.getimaginary() > obj.getimaginary())
                return 1;
            else if (this.getimaginary() < obj.getimaginary())
                return -1;
            else
                return 0;
        } catch (Exception e) {
            return 0;
        }

    }

    public int getreal() {
        return this.a;
    }

    public int getimaginary() {
        return this.b;
    }

    public String toString() {
        if (this.b >= 0)
            return this.a + "+" + this.b + "i";
        else
            return this.a + "" + this.b + "i";
    }
    
}
