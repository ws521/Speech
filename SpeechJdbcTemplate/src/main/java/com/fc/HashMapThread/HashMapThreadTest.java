package com.fc.HashMapThread;

public class HashMapThreadTest {
    public static void main(String[] args) {
        //开启四个线程
        HashMapThread thread0 = new HashMapThread();
        HashMapThread thread1 = new HashMapThread();
        HashMapThread thread2 = new HashMapThread();
        HashMapThread thread3 = new HashMapThread();
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }


}
