package Homeworks;
import java.util.*;
public class MatrixCalculations {
    public static int sumMainDiagonal(int m[][]){
        int sum=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++)
                if (i==j)   
                    sum+=m[i][j];}
        return sum;            

    }
    public static int sumUnderMainDiagonal(int m[][]){
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                if (j <= i)
                    sum += m[i][j];
        }
        return sum;
    }
    
    public static int[][] matrixMultiplication(int a[][], int b[][]) {
        int r, c;
        r = a.length;
        c = b[0].length;

        int prod[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                prod[i][j] = 0;

                for (int k = 0; k < c; k++)
                    prod[i][j] += a[i][k] * b[k][j];
            }
        return prod;
    }
    
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduceti nr de randuri pentru m1: ");
        int a=new Scanner(System.in).nextInt();
        System.out.println("Introduceti nr de coloane pentru m1: ");
        int b=new Scanner(System.in).nextInt();
        System.out.println("Introduceti nr de randuri pentru m2: ");
        int c=new Scanner(System.in).nextInt();
        System.out.println("Introduceti nr de coloane pentru m2: ");
        int d=new Scanner(System.in).nextInt();
        int m1[][]=new int[a][b];
        int m2[][]=new int[c][d];
        int m3[][]=new int [a][d];
        System.out.println("Introduceti elementele matricei: ");
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++)
                m1[i][j]=input.nextInt();}
         for(int[] row: m1) {
             System.out.println(Arrays.toString(row));
         }
            
        System.out.println("Introduceti elementele matricei: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++)
                m2[i][j] = input.nextInt();
        }
        for (int[] row : m2) {
            System.out.println(Arrays.toString(row));
        }


        System.out.println("Suma diagonalei principale: "+sumMainDiagonal(m1));
        System.out.println("Suma elementelor de sub diagonala principala: "+sumUnderMainDiagonal(m1));   
        System.out.println("Inmultirea celor 2 matrice: ");    
        if (b == c)
        {
            m3 = matrixMultiplication(m1, m2);

            System.out.println("The result of the multiplication of the first 2 matrices is: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++)
                    System.out.print(m3[i][j] + " ");
                System.out.println();
            }
        } else
            System.out.println("The given matrices cannot be multiplied.");
       
    
    
}
}
