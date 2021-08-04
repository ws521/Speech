package com.fc.algorithm;

import org.junit.Test;

import java.util.Scanner;

//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示
// 60-89分之间的用B表示，60分以下的用C表示
public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入学生成绩:");
        int b = scanner.nextInt();
        char a = (b >= 90) ? 'A' : (b >= 60) ? 'B' : 'C';

        System.out.println(a);
    }
}
