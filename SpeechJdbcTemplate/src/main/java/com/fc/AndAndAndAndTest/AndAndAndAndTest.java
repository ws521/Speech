package com.fc.AndAndAndAndTest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class AndAndAndAndTest {
//
//    @Test
//    public void AndTest() {
//        //定义一个字符串为空
//        String str = null;
//        if (str != null & !str.equals("")) {
//            System.out.println("str不为空");
//        }
//    }
//
//    @Test
//    public void AndAndTest() {
//        //定义一个字符串为空
//        String str = null;
//        if (str != null && str.equals("")) {
//            System.out.println("str不为空");
//        }
//    }

//    @Test
//    public void TestAndCalculation() {
//        System.out.println(3 & 2);
//        System.out.println(5 & 2);
//        System.out.println(7 & 2);
//        System.out.println(10 & 2);
//    }

    @Test
    public void TestAndHexadecimal() {
        int a=5;
        System.out.println(1111 & 0x7FFFFFFF);
        System.out.println("1"+a);
    }

    @Test
    public void TestSet(){

        Set<Object> set = new HashSet<>();
        boolean add = set.add("1");
        boolean add1 = set.add("1");
        System.out.println(add);
        System.out.println(add1);


    }
}
