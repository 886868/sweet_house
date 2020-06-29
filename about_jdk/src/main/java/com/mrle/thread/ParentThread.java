package com.mrle.thread;

public class ParentThread {

    public static void main(String[] args) throws InterruptedException {
        Thread child = new Thread(() -> System.out.println("子线程：" + Thread.currentThread().getName() + "执行"));
        child.start();

        child.join();

        System.out.println("main thread end");
    }
}
