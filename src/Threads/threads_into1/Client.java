package Threads.threads_into1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            TableCreater tb = new TableCreater(i);
            Thread tread = new Thread(tb);
            tread.start();
        }

    }
}
