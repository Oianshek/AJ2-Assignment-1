package kz.edu.astanait.threads;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class ParentThreadClass<T> extends Thread implements Callable<T> {
    protected String searchInput;
    protected String url = "C:\\Users\\oians\\IdeaProjects\\AJ2-Assignment-1\\src\\main\\java\\dir2\\";
    protected File dir2 = new File(url);
    protected List<File> files = Arrays.asList(dir2.listFiles());

    public ParentThreadClass(String searchInput) {
        this.searchInput = searchInput;
    }

    public String getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(String searchInput) {
        this.searchInput = searchInput;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public File getDir2() {
        return dir2;
    }

    public void setDir2(File dir2) {
        this.dir2 = dir2;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
