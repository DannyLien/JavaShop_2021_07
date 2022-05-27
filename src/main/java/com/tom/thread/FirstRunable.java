package com.tom.thread;

public class FirstRunable implements Runnable {
    String name;

    public FirstRunable() {
    }

    public FirstRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + " Reading... " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
