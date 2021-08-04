package com.fc.HashMapThread;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HashTableThread extends Thread{
    //AtomicInteger原子操作类
    private static AtomicInteger ai=new AtomicInteger();
    //创建一个HashTable
    private static Map<Integer,Integer> table=new Hashtable<>();

    @Override
    public void run() {
        //循环1000000次
        while (ai.get()<1000000){
            table.put(ai.get(),ai.get());
            //自在增长一
            ai.incrementAndGet();
        }
        //输出一下map长度
        System.out.println("成功执行完成");
        System.out.println(table.size());
    }
}
