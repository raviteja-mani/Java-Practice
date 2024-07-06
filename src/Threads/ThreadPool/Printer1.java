package Threads.ThreadPool;

public class Printer1 implements Runnable{
    int n;
    public Printer1(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Thread "+n+" no. "+Thread.currentThread().getName());
    }
}
