package Threads.MergeSortThroughThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayList;
    ExecutorService executor;
    public Sorter(List<Integer> arrayList,ExecutorService es) {
        this.arrayList = arrayList;
        this.executor = es;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayList.size()==1) return arrayList;
        int n = arrayList.size();
        int mid = n/2;
//        ExecutorService pool1 = Executors.newFixedThreadPool(2);
//        ExecutorService pool2 = Executors.newFixedThreadPool(2);
        List<Integer> list1 =  arrayList.subList(0,mid);
        List<Integer> list2 =  arrayList.subList(mid,n);
       Future<List<Integer>> future1 =  executor.submit(new Sorter(list1,executor));
        Future<List<Integer>> future2 = executor.submit(new Sorter(list2,executor));
        list1 = future1.get();
        list2 = future2.get();
        //merge these two lists by sorting
        List<Integer> result = new ArrayList<>();
        int n1 = 0;
        int n2 = 0;
        while(n1<list1.size() && n2<list2.size()){
            if(list1.get(n1)<list2.get(n2)){
                result.add(list1.get(n1));
                n1++;
            }
            else {
                result.add(list2.get(n2));
                n2++;
            }
        }
        while(n1<list1.size()){
            result.add(list1.get(n1));
            n1++;
        }
        while(n2<list2.size()){
            result.add(list2.get(n2));
            n2++;
        }

        return result;
    }
}
