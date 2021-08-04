package com.fc.Meituan;

import org.springframework.util.comparator.ComparableComparator;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestList {
    public static List<person> Test(List<person> list) {
        //排序
        list.sort(new person());

        System.out.println(list);



        HashSet<person> set = new HashSet<>(list);

        System.out.println(set);
        list.clear();

        list.addAll(set);


        return list;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","map1");
        map.put("2","map1");
        map.put("3","map1");


        HashMap<String, String> map1 = new HashMap<>();

        map1.put("1","map2");
        map1.put("2","map2");
        map1.put("3","map2");
        map1.put("4","map2");

        map1.putAll(map);
        System.out.println(map1);
        System.out.println(map1.containsValue("map2"));



//        HashSet<Object> set = new HashSet<>();
//        boolean a = set.add("a");
//        boolean a1 = set.add("a");
//        System.out.println(a);
//        System.out.println(a1);

//        List<String> list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        System.out.println(list);

//        List<String> list2 = new ArrayList<>();
//
//
//        list2.add("3");
//        list2.add("4");
//        list2.add("5");
//        list2.addAll(1,list);
//        System.out.println(list2);
//
//
//        Collection<String> c = new ArrayList<String>();
//
//        c.add("雪花纯生");
//        c.add("修道院啤酒");
//        c.add("1664");
//        c.add("泰山精酿");
//        c.add("时光精酿");
//
//        System.out.println(c);
//
//        Iterator<String> iterator = c.iterator();
//        System.out.println(iterator);
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//            c.remove("1664");
//        }


//
//        String a="";
//        System.out.println(a.isEmpty());
//
//        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,
//                5, 1000, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<Runnable>(10));
//
//        tpe.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程池创建线程");
//            }
//        });
//
//        tpe.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程池创建线程");
//            }
//        });
//
//        tpe.shutdown();

//
//        Thread thread = new Thread();
//        //设置当前线程是守护线程
//        thread.setDaemon(true);
        //判断当前线程是否为守护线程
        //       System.out.println(thread.isDaemon());


//
//
//        double random = Math.random()*10;
//        System.out.println(random);
//
//
//        person person1 = new person(1, 10, 158);
//        person person2 = new person(2, 45, 160);   //
//        person person3 = new person(3, 44, 185);//
//        person person4 = new person(4, 80, 170);
//        person person5 = new person(5, 44, 172);//
//        person person6 = new person(6, 45, 175);   //
//        person person7 = new person(7, 44, 172);//
//        person person8 = new person(8, 44, 185);//
//        List<person> list = new ArrayList<>();
//        list.add(person1);
//        list.add(person2);
//        list.add(person3);
//        list.add(person4);
//        list.add(person5);
//        list.add(person6);
//        list.add(person7);
//        list.add(person8);
//        List<person> persons = Test(list);
//
//        for (person person : persons) {
//            System.out.println(person);
//        }


    }
}
