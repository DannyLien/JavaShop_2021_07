package com.tom.thread;

public class Runner {
    public static void main(String[] args) {

        FirstThread firstthread = new FirstThread();
        firstthread.start();
        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();

        Thread firstrunable = new Thread(new FirstRunable());
        firstrunable.start();
        new Thread(new FirstRunable("h1")).start();
        new Thread(new FirstRunable("h2")).start();
        new Thread(new FirstRunable("h3")).start();

    }
}
