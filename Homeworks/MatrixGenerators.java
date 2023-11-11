package Homeworks;
import java.util.*;
public class MatrixGenerators {
    public static int[][] matrix1(int size) {
        int a[][] = new int[size][size];
        int k = 1;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                a[i][j] = k++;

        return a;
    }
    
    public static int[][] matrix2(int size) {
        int a[][] = new int[size][size];
        int k = 1;

        for (int j = 0; j < size; j++)
            for (int i = 0; i < size; i++)
                a[i][j] = k++;

        return a;
    }
    
    public static int[][] matrix3(int size) {
        int a[][] = new int[size][size];
        int k = 1;
        for (int i = 0; i < size; i++)
            if (i % 2 == 0)
                for (int j = 0; j < size; j++)
                    a[i][j] = k++;
            else
                for (int j = 0; j < size; j++)
                    a[i][size - j - 1] = k++;

        return a;
    }
    public static int[][] matrix4(int size){
        int[][] mat =new int[size][size];
        int top= 0;
        int left= 0;
        int right= size-1;
        int bottom= size-1;
        int index=1;
        char check='r';
        while (left<=right && top<=bottom){
            if(check=='r'){
                for(int i=left;i<=right;i++)
                {   mat[top][i]=index;
                    index++;
                }
                top++;
                check='d';
            }
            if(check=='d'){
                for(int i=top;i<=bottom;i++)
                    {   mat[i][right]=index;
                        index++;
                    }
                     right--;
                     check='l';   


                
            }
            if(check=='l'){
                for(int i=right;i>=left;i--)
                {   mat[bottom][i]=index;
                    index++;
                }
                 bottom--;
                 check='u';
            }
            if(check=='u'){
                for(int i=bottom;i>=top;i--)
                    {   mat[i][left]=index;
                        index++;
                    }
                     left++;
                     check='r';
            }

        }
        return mat;
    }

    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("n= ");
        int n=input.nextInt();
        int[][] m1=new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] m3 = new int[n][n];
        int[][] m4 = new int[n][n];
        m1=matrix1(n);
        m2=matrix2(n);
        m3=matrix3(n);
        m4=matrix4(n);
        for (int[] row : m1) {
            System.out.println(Arrays.toString(row));

        }
        System.out.println();
        for (int[] row : m2) {
            System.out.println(Arrays.toString(row));

        }
        System.out.println();
    
        for (int[] row : m3) {
            System.out.println(Arrays.toString(row));

        }
        System.out.println();
        for(int []row: m4){
            System.out.println(Arrays.toString(row));

        }

        
    }
}
