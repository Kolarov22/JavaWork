package Laboratory;

import java.util.ArrayList;
import java.util.Collections;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<IntegerNumber> integers = new ArrayList<IntegerNumber>();
        ArrayList<RealNumber> reals = new ArrayList<RealNumber>();
        IntegerNumber nr1 = new IntegerNumber(10);
        IntegerNumber nr2 = new IntegerNumber(11);
        IntegerNumber nr3 = (IntegerNumber) nr1.add(nr2);
        System.out.println(nr3);
        IntegerNumber nr4 = (IntegerNumber) nr1.subtract(nr2);
        System.out.println(nr4);

        integers.add(nr1);
        integers.add(nr2);
        integers.add(nr3);
        integers.add(nr4);

        RealNumber r1 = new RealNumber(10.5);
        RealNumber r2 = new RealNumber(21.35);
        RealNumber r3 = (RealNumber) r1.add(r2);
        System.out.println(r3);
        RealNumber r4 = (RealNumber) r1.subtract(r2);
        System.out.println(r4);

        reals.add(r1);
        reals.add(r2);
        reals.add(r3);
        reals.add(r4);

        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(2, 5);
        ComplexNumber c3 = (ComplexNumber) c1.add(c2);
        System.out.println(c3);
        ComplexNumber c4 = (ComplexNumber) c1.subtract(c2);
        System.out.println(c4);

        System.out.println();

        Collections.sort(integers);
        Collections.sort(reals);

        for (var i : integers)
            System.out.println(i);

        for (var i : reals)
            System.out.println(i);
    }
}
