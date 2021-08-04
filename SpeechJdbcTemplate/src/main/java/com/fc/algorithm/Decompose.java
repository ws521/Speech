package com.fc.algorithm;

import org.junit.Test;

import java.util.Scanner;

//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class Decompose {
    @Test
    public void test() {

        int n = 5;
        int k = 2;
        while (n >= k) {
            if (n == k) {
                System.out.println(k);
                break;
            } else if (n % k == 0) {
                System.out.println(k);
                n = n / k;
            } else {
                k++;
            }
        }
    }


}
