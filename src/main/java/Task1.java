import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        int c = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of threads: "+c);
        String url = "C:\\Users\\oians\\IdeaProjects\\AJ2-Assignment-1\\src\\main\\java\\dir\\";
        File dir = new File(url);
        File[] files = dir.listFiles();
        Thread[] threads = new Thread[c];

        int k = 0;
        for (int i = 0; i < files.length; i++){
            threads[k] = new MyThread(files[i],url);
            threads[k].start();
            k++;
            k%=c;
        }

    }
}
