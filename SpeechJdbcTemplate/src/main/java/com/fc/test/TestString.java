package com.fc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestString {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {

            list.remove(i);i--;
            System.out.println(list.get(i));

        }

//
//        HashMap<Object, Object> hashMap = new HashMap<>();
//        hashMap.put("Aa", "Aa");
//        hashMap.put("BB", "BB");
//        hashMap.put("AaAa", "AaAa");
//        hashMap.put("AaBB", "AaBB");
//        hashMap.put("BBAa", "BBAa");
//        hashMap.put("BBBB", "BBBB");
//        hashMap.put("AaAaAa", "AaAaAa");
//        hashMap.put("AaAaBB", "AaAaBB");
//        hashMap.put("AaBBAa", "AaBBAa");
//        hashMap.put("AaBBBB", "AaBBBB");
//        hashMap.put("BBAaAa", "BBAaAa");
//        hashMap.put("BBAaBB", "BBAaBB");
//        hashMap.put("BBBBAa", "BBBBAa");
//        hashMap.put("BBBBBB", "BBBBBB");




//
//        int n=8;
//        n |= n >>> 1;//01000|00100----->01100--12
//        n |= n >>> 2;//01100|00011----->01111--15
//        n |= n >>> 4;//01111|00000----->01111--15
//        n |= n >>> 8;//01111|00000----->01111--15
//        n |= n >>> 16;//01111|00000----->01111--15
//
//        System.out.println(n);
//
//        ArrayList<Object> list = new ArrayList<>();
//        ArrayList<Object> list1 = new ArrayList<>();
//        list1.addAll(list);
//        list1.remove(1);



//        UserFactory uf =Student::new;
//        Student u = uf.get("yyqx");
//        System.out.println(u);
    }
}
