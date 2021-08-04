package com.fc.HashMapThread;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapGetTest {

    @Test
    public void TestGet(){
    //    System.out.println(Runtime.getRuntime().availableProcessors());
        HashMap<String, Object> map = new HashMap<>();
        new ConcurrentHashMap<>();
        map.put("1",null);
        map.put("2","a");
        System.out.println(map.get("2"));
        System.out.println(map.get("1"));
        System.out.println(map.get("5"));
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey("5"));
        Object o = new Object();
        o.equals("");
    }

}
