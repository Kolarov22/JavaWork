package Laboratory;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Ex2 {
    
    public static String Read() throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\Andrei\\Desktop\\java\\Laboratory\\numbers.txt");
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(reader);
        String input = br.readLine();
        br.close();
        reader.close();
        fin.close();
        return input;
    }

    public static void Write(ArrayList<Integer> list) throws IOException {
        PrintWriter fout = new PrintWriter(new FileWriter("C:\\Users\\Andrei\\Desktop\\java\\Laboratory\\output.txt"));
        // FileOutputStream fout = new FileOutputStream("Result.txt");
        // OutputStreamWriter writer = new OutputStreamWriter(fout);
        // BufferedWriter bw = new BufferedWriter(writer);
        for (int i = 0; i < list.size(); i++) {
            int nr = (int) list.get(i);
            System.out.print(nr + " ");
            fout.print(nr + " ");
        }
        fout.close();
    }

    public static void main(String[] args) throws IOException {
        String input = Read();
        var numbers = input.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (var number : numbers)
            list.add(Integer.parseInt(number));
        Collections.sort(list);
        Write(list);

    }
}
        
        
        
    
    

