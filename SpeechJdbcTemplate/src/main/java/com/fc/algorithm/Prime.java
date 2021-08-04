package com.fc.algorithm;

import org.junit.Test;

//判断101-200之间有多少个素数，并输出所有素数
public class Prime {
    @Test
    public void Test() {
        //
        int num = 0;
        for (int i = 101; i <= 200; i++) {
            //把
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                } else if (j > (i / 2 - 1)) {
                    num++;
                    System.out.println(i);
                    break;
                }
            }
        }
        System.out.println("共有" + num + "个素数");
    }

    @Test
    public void Test2() {
        int count = 0;
        for (int i = 101; i < 200; i += 2) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
