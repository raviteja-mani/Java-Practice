package Threads.threads_into1;

public class TableCreater implements  Runnable{
    int n;
    public TableCreater(int n){
        this.n =n;
    }
    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println(n+" times "+i+" is "+(i*n));
        }
    }

    public void createTable(int n) {

}
}
