package com.tom.thread;

public class Tester3 {
    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println("Type1 LamdaThread... " + i);
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        new Thread (()-> {
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println("Type2 LamdaThread... " + i);
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
