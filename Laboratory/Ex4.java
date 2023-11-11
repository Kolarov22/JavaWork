package Laboratory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String args[]) throws IOException {

        String nextSearch;
        File file = new File("C:\\Users\\Andrei\\Desktop\\java\\Laboratory\\zip.txt");
        Scanner read = new Scanner(file);
        ArrayList<String> sor = new ArrayList<String>();

        int dim = 0;

        while (read.hasNextLine()) {
            dim++;
            nextSearch = read.nextLine();
            sor.add(nextSearch);
        }
        System.out.println("Dimension is: " + dim);

        Scanner scan = new Scanner(System.in);
        String searchTown = scan.nextLine();
        String searchState = scan.nextLine();

        int c = 0;
        for (String element : sor) {
            if (element.contains(searchTown) && element.contains(searchState)) {
                System.out.println(element);
                c = 1;
                break;
            }
        }
        if (c == 0)
            System.out.println("not found");
    }
}
