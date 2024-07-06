package Threads.threads_intro2;

public class Client {
    public static void main(String[] args) {
        System.out.println(" I am the main class");
        Adder adder = new Adder();
        Subtractor subtractor = new Subtractor();
        Thread thread = new Thread(adder);
        thread.start();
        thread = new Thread(subtractor);
        thread.start();
    }
}
