package com.fc.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author cuiods
 */
public class MazeCell {
    private int x;
    private int y;
    private int step;

    public MazeCell(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.findPath();
    }
}

/** 测试类
 * @author csdn-zhangteacher
 * test main
 */
//public class Main {


//}//package com.fc.test;
//
//import java.util.*;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Demo02 {
//    public static void main(String[] args) {
//        //collections常用方法
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("6");
//        //给指定的集合添加多个元素
////        Collections.addAll(list, "8", "7");
////        System.out.println(list);
//
//        //打乱集合元素的顺序
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        //集合元素排序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.hashCode()-o1.hashCode();
//            }
//        });
//        System.out.println(list);
//
//        //


















































































//        long l = Runtime.getRuntime().maxMemory();
//
//        long l1 = Runtime.getRuntime().totalMemory();
//        HashMap<Object, Object> map = new HashMap<>();
//        Hashtable<Object, Object> table = new Hashtable<>();
//        table.put(null,"");
//        new ConcurrentHashMap<>();
//
//        System.out.println(map.get(""));
//
//        new AtomicInteger();
//        System.out.println(l);
//        System.out.println(l1);
//    }
//}
