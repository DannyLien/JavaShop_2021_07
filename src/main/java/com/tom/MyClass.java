package com.tom;

public abstract class MyClass {

    public void calate() {
        System.out.println("calate...");
    }

    abstract void print();

    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            void print() {
                System.out.println("MyClass...print()");
            }
        };
        myClass.print();
        myClass.calate();

        MyClass subClass = new SubClass();
        subClass.print();

    }

}


class SubClass extends MyClass {

    @Override
    void print() {
        System.out.println("SubClass...");
    }
}
