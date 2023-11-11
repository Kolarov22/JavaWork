import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

class WordCountTask implements Callable<Map<String, Integer>> {
    private File file;

    public WordCountTask(File file) {
        this.file = file;
    }

    public Map<String, Integer> call() {

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String contents = sb.toString();

            String[] words = contents.split(" ");


            for (String word : words) {
                word = word.toLowerCase();
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error processing file: " + file.getName());
        }

        return wordCount;
    }
}