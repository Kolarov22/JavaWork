import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WordCount {

    public static void main(String[] args) {

        File dir = new File(".");


        File[] files = dir.listFiles();


        ExecutorService executor = Executors.newFixedThreadPool(4);


        Map<String, Integer> wordCount = new HashMap<>();


        for (File file : files) {

            if (file.getName().endsWith(".txt")) {

                Future<Map<String, Integer>> result = executor.submit(new WordCountTask(file));


                try {
                    Map<String, Integer> fileWordCount = result.get();
                    for (Map.Entry<String, Integer> entry : fileWordCount.entrySet()) {
                        String word = entry.getKey();
                        int count = entry.getValue();
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + count);
                        } else {
                            wordCount.put(word, count);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error processing file: " + file.getName());
                }
            }
        }


        executor.shutdown();


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


