package Laboratory;
import java.io.*;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 0;
        int max;
        int min;
        int compare;
        double avg=0;
        File input = new File("C:\\Users\\Andrei\\Desktop\\java\\Laboratory\\numbers.txt");
        Scanner scan = new Scanner(input);

        max = scan.nextInt();
        min = max;
        while(scan.hasNextInt()){
            avg += compare = scan.nextInt();
            
            i++;
            if(min > compare)
                min = compare;
            if(max < compare)
                max = compare;

        }
        avg = avg/i;

        System.out.println("Max equals: " + max + "  min equals: " + min + " the average is: " + avg);
        scan.close();
        
    }
        

    
}
