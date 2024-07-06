package Threads.MergeSortThroughThreads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    int data ;
    Client next;
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(8);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,2,6,5,8));
        Future<List<Integer>> f = es.submit(new Sorter(list,es));
        list = f.get();
        System.out.println(list);
    }
    public Client(int data){
        this.data=data;
        this.next = null;
    }
    public Client(Client next){
        this(next.data);
        this.next = next.next;
    }
}
