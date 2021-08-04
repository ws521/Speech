package com.fc.algorithm;

import org.junit.Test;

//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
// 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
// 因为153=1的三次方＋5的三次方＋3的三次方。
public class Daffodils {
    @Test
    public void Test() {
        int one;
        int two;
        int there;
        //范围定在100-1000之间
        for (int i = 100; i < 1000; i++) {
            one = i / 100;
            two = i / 10 % 10;
            there = i % 10;
            if ((one * one * one) + (two * two * two) + (there * there * there) == i) {
                System.out.println(i);
            }
        }
    }
}
