package Laboratory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.sort;

public class Ex3 {
    public static void main(String args[]) throws IOException {

        String nextSearch;
        File file = new File("C:\\Users\\Andrei\\Desktop\\java\\Laboratory\\test.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> reverse = new ArrayList<String>();

        while (scan.hasNextLine()) {

            nextSearch = scan.nextLine();

            reverse.add(nextSearch);
        }
        Collections.reverse(reverse);

        String fileName = "out.txt";

        PrintWriter outputStream = new PrintWriter(fileName);

        for (String str : reverse) {
            outputStream.println(str);
        }

        outputStream.close();
    }
}
