package com.fc.HashMapThread;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class HashMapThread extends Thread {
    //AtomicInteger原子操作类
    private static AtomicInteger ai=new AtomicInteger();
   Set<Object> s=new LinkedHashSet<>();



    //创建一个HashMap
    private static Map<Integer,Integer> map=new HashMap<>();
    @Override
    public void run() {
        //循环1000000次
      while (ai.get()<1000000){
          //put
          map.put(ai.get(),ai.get());
          //自在增长一
          ai.incrementAndGet();
          ai.getAndIncrement();
      }
      //输出一下map长度
        System.out.println(map.size());
    }
}
