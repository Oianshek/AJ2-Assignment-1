package kz.edu.astanait.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ThreadInFile extends ParentThreadClass<Map<String,Integer>> {
    private Map<String,Integer> frequency = new HashMap<>();

    public ThreadInFile(String searchInput) {
        super(searchInput);
    }

    @Override
    public Map<String,Integer> call() {
        FileReader fileReader;

        for (File file : files) {
            int k = 0;
            String text = "";

            try {
                fileReader = new FileReader(file);

                int i = 0;
                while((i = fileReader.read()) != -1){
                    text+=(char)i;
                }
                System.out.println(text);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String words[] = text.split(" ");

            for(String word: words){
                if(word.equals(searchInput)){
                    k++;
                }
            }
            frequency.put(file.getName(),k);
        }

        return frequency;
    }
}
