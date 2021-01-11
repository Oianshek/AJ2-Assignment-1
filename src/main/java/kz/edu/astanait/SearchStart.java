package kz.edu.astanait;

import kz.edu.astanait.threads.ThreadInFile;
import kz.edu.astanait.threads.ThreadName;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class SearchStart {

    public synchronized Map<String,Integer> startThreadInFile(String searchInput){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Map<String,Integer>> future = executorService.submit((Callable<Map<String, Integer>>) new ThreadInFile(searchInput));

        Map<String,Integer> map = new HashMap<>();
        
        try {
            map.putAll(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        return map;
    }

    public synchronized Integer startThreadName(String searchInput){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit((Callable<Integer>) new ThreadName(searchInput));

        try {
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdownNow();

        return 0;
    }
}
