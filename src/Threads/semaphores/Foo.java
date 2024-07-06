package Threads.semaphores;


import java.util.concurrent.Semaphore;

  class Foo {

    private static Semaphore mutex = new Semaphore(1);
    public Foo() {
    }

    public static void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        mutex.acquire();
        printFirst.run();
        mutex.release();
    }

    public static void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
//        Thread.wait(1000);
//        printSecond.
        mutex.acquire();
        printSecond.run();
        mutex.release();

    }

    public static void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
//        Thread.wait(2000);
        mutex.acquire();
        printThird.run();
        mutex.release();
    }
}