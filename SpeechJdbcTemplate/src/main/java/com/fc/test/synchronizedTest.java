package com.fc.test;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class synchronizedTest {
    static int a = 5;

    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();
        map.put("","");
        map.get("");

        String a = "123456";
        System.out.println(a.substring(2));

//        ReentrantLock reentrantLock = new ReentrantLock();
//
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                try {
//                    reentrantLock.lock();//开启锁
//                    a = 10;
//                    Thread.sleep(5);
//                    System.out.println("thread2 "+a);
//                    reentrantLock.unlock();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                // boolean b = reentrantLock.tryLock();
//                //reentrantLock.unlock();//释放锁
//
//            }
//        });
//        Thread thread = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                boolean b = reentrantLock.tryLock();
//                a = 20;
//
//                System.out.println("thread:"+a);
//            }
//        });
//
//        thread.start();
//        thread2.start();


//
//        int a = 5;
//        String k = null;
//
//            synchronized (synchronizedTest.class) {
//
//                a = 10;
//
//                a = 20;
//            }
//
//        System.out.println(a);
    }
}
