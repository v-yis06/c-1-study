package com.study;

public class Test {
    public static void main(String args[]) throws InterruptedException {
        int number111 = 1;

        new Thread(new Runnable() {
            @Override
            public void run() {
                int age = number111 + 1;
            }
        }).start();
        //number111 = 12;

        Thread.sleep(3000);
    }
}
