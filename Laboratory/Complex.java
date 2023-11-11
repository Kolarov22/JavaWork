package Laboratory;

public class Complex {
    private double re;
    private double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex a, Complex b) {
        Complex suma = new Complex();
        suma.re = a.re + b.re;
        suma.im = a.im + b.im;
        return suma;
    }

    public Complex sub(Complex a, Complex b) {
        Complex scadere = new Complex();
        scadere.re = a.re - b.re;
        scadere.im = a.im - b.im;
        return scadere;
    }

    public Complex mult(Complex a, Complex b) {
        Complex produs = new Complex();
        produs.re = a.re * b.re + a.im * b.im * -1;
        produs.im = a.re * b.im + a.im * b.re;
        return produs;
    }

    public Complex div(Complex a, Complex b) {
        Complex raport = new Complex();
        Complex c = new Complex(b.re, -b.im);
        double den = b.re * b.re + b.im * b.im;

        raport.re = mult(a, c).re / den;
        raport.im = mult(a, c).im / den;
        return raport;
    }

    public void tupleFormat() {
        System.out.println("(" + this.re + ", " + this.im + ")");
    }
    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex test= new Complex();
        System.out.println("Suma dintre cele 2 numere: ");
        test=test.add(a, b);
        test.tupleFormat();

        System.out.println("Diferenta dintre cele 2 numere: ");
        test = test.sub(a, b);
        test.tupleFormat();

        System.out.println("Produsul dintre cele 2 numere: ");
        test = test.mult(a, b);
        test.tupleFormat();

        System.out.println("Raportul dintre cele 2 numere: ");
        test = test.div(a, b);
        test.tupleFormat();
    }
}