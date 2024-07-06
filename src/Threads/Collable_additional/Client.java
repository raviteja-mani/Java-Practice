package Threads.Collable_additional;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ExecutorService es = Executors.newCachedThreadPool();
       Future<ArrayList<Integer>> f = es.submit(new ArrayCreator(n));
       ArrayList<Integer> list = f.get();
        System.out.println(f.get());
    }
}
