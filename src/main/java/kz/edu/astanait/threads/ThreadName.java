package kz.edu.astanait.threads;

import java.io.File;
import java.util.HashMap;

public class ThreadName extends ParentThreadClass<Integer> {
    private HashMap<String,Integer> frequency;


    public ThreadName(String searchInput) {
        super(searchInput);
    }

    @Override
    public Integer call() {

        int k = 0;
        for (File file : files) {
            if(file.getName().substring(0,file.getName().lastIndexOf('.')).contains(searchInput)){
                k++;
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return k;
    }
}
