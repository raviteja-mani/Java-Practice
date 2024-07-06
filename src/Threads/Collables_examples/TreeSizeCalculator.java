package Threads.Collables_examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node head;
    ExecutorService threadPool;
    public TreeSizeCalculator(Node head, ExecutorService threadPool) {
        this.head = head;
        this.threadPool = threadPool;

    }
    @Override
    public Integer call() throws Exception {
        if(head == null) {
            return 0;
        }
      Future<Integer> f1 =  threadPool.submit(new TreeSizeCalculator(head.left, threadPool));
        Future<Integer> f2 =  threadPool.submit(new TreeSizeCalculator(head.right, threadPool));
        int a = f1.get()+1;
        int b = f2.get();


        return a+b;
    }
}
