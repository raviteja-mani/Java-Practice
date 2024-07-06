package Threads.Synchronization_1;

import java.util.concurrent.Semaphore;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }
    public synchronized void incValue(int offset){
        count += offset;
    }
    public int getValue(){
        return count;
    }
    public synchronized void decValue(int offset){}
//        Semaphore





}
