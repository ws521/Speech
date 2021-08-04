package com.fc.test;

import com.mysql.jdbc.util.LRUCache;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class LRUCacheTest {
    public void a() {
        b();

    }

    public void b() {
        return;

    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        new Object();





        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println("key:" + s);
            System.out.println("value:" + map.get(s));
        }
        map.forEach((key, value) -> {
            System.out.println("key:" + key);
            System.out.println("value:" +value);
        });


        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey());
            System.out.println(s.getValue());

        }



//
//        int a = 0;
//        Integer b = null;
//        System.out.println(a);
//
//         System.out.println(b);


        //new LRUCacheTest().a();


//new ThreadPoolExecutor(1,1,1,1 ,11,,1);

//
//        LRUCache lruCache = new LRUCache(2);
////        lruCache.put(1,1);
////        lruCache.put(2,2);
////        lruCache.put(3,3);
////        String a="a";
////        System.out.println(lruCache);
//
//
//        Class<? extends LRUCache> aClass = lruCache.getClass();
//
//        ClassLoader classLoader = aClass.getClassLoader();
//
//        ClassLoader parent = classLoader.getParent();
//        System.out.println(parent);
//        System.out.println(parent.getParent());
//
//
//new Thread()
    }
}
