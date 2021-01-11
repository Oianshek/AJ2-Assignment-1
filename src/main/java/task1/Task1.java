package task1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Task1 {
    public static void main(String[] args) {
        int c = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of threads: "+c);
        String url = "C:\\Users\\oians\\IdeaProjects\\AJ2-Assignment-1\\src\\main\\java\\dir\\";
        File dir = new File(url);
        File fileArr[] = dir.listFiles();
        ArrayBlockingQueue<File> files = new ArrayBlockingQueue(fileArr.length,false, Arrays.asList(fileArr.clone()));
        Thread[] threads = new Thread[c];

        int k = 0;
        for (File file :files){
            threads[k] = new Thread(new MyThread(file,url));
            threads[k].start();
            k++;
            k%=c;
        }

    }
}
