package Homeworks;

import java.lang.Math;
public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
    double x;
    double y;
    public static void main(String[] args) {
        Distance X1=new Distance();
        X1.x=0;
        X1.y=0;
        Distance X2=new Distance();
        X2.x=4;
        X2.y=5;
        System.out.println(distance(X1.x, X1.y, X2.x, X2.y));
    }
}
