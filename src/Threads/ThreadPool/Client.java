package Threads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        int n = 1000;
//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i =0;i<=n;i++){
//            Thread thread = new Thread(new Printer1(i));
//            thread.start();
            es.execute(new Printer1(i));
//            es.submit(); -> for callable interface if thread needs to return something
//            Future<T> f = es.submit(callable);
//            f.get();
        }

    }
}
