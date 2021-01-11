package task1;

import java.io.File;

public class MyThread implements Runnable{
    private static int c = 0;
    private String name;
    private File file;
    private String url;

    public MyThread(File file, String url) {
        c++;
        this.name = Integer.toString(c);
        this.file = file;
        this.url = url;
    }

    @Override
    public void run() {
        file.renameTo(new File(url+name+file.getName().substring(file.getName().lastIndexOf('.'))));
    }
}
