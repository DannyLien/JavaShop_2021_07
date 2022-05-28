package com.tom.thread;

public class Tester1 {
    public static void main(String[] args) {

        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();


        new Thread(new FirstRunable("*h1")).start();
        new Thread(new FirstRunable("*h2")).start();
        new Thread(new FirstRunable("*h3")).start();
        new Thread(new FirstRunable("*h4")).start();


    }
}
