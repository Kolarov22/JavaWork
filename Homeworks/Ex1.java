package Homeworks;

public class Ex1 
{
    static int[] noDuplicates(int[] a)
    {
        int end = a.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (a[i] == a[j]) {                  
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        a[shiftLeft] = a[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] temp = new int[end];
        for(int i = 0; i < end; i++)
            temp[i] = a[i];
        a = temp.clone();
        return a;
    }
    public static void main(String[] args)
    {
        int[] a = {1, 2, 1, 1, 3, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2};
        a = noDuplicates(a);
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
