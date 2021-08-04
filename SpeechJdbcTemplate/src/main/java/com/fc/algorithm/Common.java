package com.fc.algorithm;

import org.junit.Test;

import java.util.Scanner;

//输入两个正整数m和n，求其最大公约数和最小公倍数
public class Common {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入m");
        int a = input.nextInt();
        System.out.println("请输入n");
        int b = input.nextInt();
        Common common = new Common();
        int i = common.gongyinshu(a, b);
        System.out.println("最小公因数" + i);
        System.out.println("最大公倍数" + a * b / i);
    }

    public int gongyinshu(int a, int b) {

        if (a < b) {

            int t = b;

            b = a;

            a = t;

        }

        while (b != 0) {

            if (a == b)

                return a;

            int x = b;

            b = a % b;

            a = x;

        }

        return a;

    }
}
