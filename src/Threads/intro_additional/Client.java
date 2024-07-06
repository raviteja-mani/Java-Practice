package Threads.intro_additional;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ScalerThread th = new ScalerThread(new Adder(a,b));
        th.start();
    }
}
