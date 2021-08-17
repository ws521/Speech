package com.fc.ArrayList;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList{


    public static void main(String[] args) {
        TestCopyOnWriteArrayList m = new TestCopyOnWriteArrayList();



        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("","");
        HashMap<Object, Object> map = new HashMap<>();
        map.put("","");
          map.put("","");
        map.get("");
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(5);
        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);

    }
}
