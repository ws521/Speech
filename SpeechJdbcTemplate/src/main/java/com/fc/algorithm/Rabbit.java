package com.fc.algorithm;

import org.junit.Test;

//有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，
// 假如兔子都不死，问每个月的兔子总数为多少？
public class Rabbit {
//
//    public static void main(String[] args) {
//        int a=27+24*2+21*3+18*4+15*5+12*6+9*7+6*8+3*9;
//        a=a+24*2+21*3+18*4+15*5+12*6+9*7+6*8+3*9;
//        a=a+21*3+18*4+15*5+12*6+9*7+6*8+3*9;
//        a=a+18*4+15*5+12*6+9*7+6*8+3*9;
//        a=a+15*5+12*6+9*7+6*8+3*9;
//        a=a+12*6+9*7+6*8+3*9;
//        a=a+9*7+6*8+3*9;
//        a=a+6*8+3*9;
//        a=a+3*9;
//        System.out.println(a);
//    }


    @Test
    public void RabbitTest() {
        //可以生小兔子的数量
        int give = 0;
        //刚出生的小兔子数量
        int born = 2;
        //一个月的小兔子
        int one = 0;
        //二个月的小兔子
        int two = 0;
        //三个月的小兔子
        int three = 0;
        //所有兔子数量
        int num = 2;
        //月
        int m = 30;
        for (int i = 1; i <= m; i++) {
            //如果有三个月大的兔子，那么就可以生兔子的数量加上三个月大的兔子数量
            //并清空三个月大的兔子
            if (three > 0) {
                give = give + three;
                three = 0;
            }
            //如果有二个月大的兔子，那么就三个月大的兔子的数量等于二个月大的兔子数量
            //并清空二个月大的兔子
            if (two > 0) {
                three = two;
                two = 0;
            }
            //如果有一个月大的兔子，那么就二个月大的兔子的数量等于一个月大的兔子数量
            //并清空一个月大的兔子
            if (one > 0) {
                two = one;
                one = 0;
            }
            //如果有刚出生的兔子，那么就一个月大的兔子的数量等于刚出生的兔子数量
            //并清空刚出生的兔子
            if (born > 0) {
                one = born;
                born = 0;

            }
            //如果有可以生育的兔子，那么刚出生的兔子的数量等于可以生育的兔子数量
            //并清空刚出生的兔子
            if (give > 0) {
                born = give;
            }
            //总数量等于各个阶段的数量之和
            num = give + born + one + two + three;

            System.out.println("第" + i + "月" + "可以生兔子的个数：" + give);
            System.out.println("第" + i + "月" + "刚出生的兔子的个数：" + born);
            System.out.println("第" + i + "月" + "一个月的兔子的个数：" + one);
            System.out.println("第" + i + "月" + "二个月的兔子的个数：" + two);
            System.out.println("第" + i + "月" + "三个月的兔子的个数：" + three);
            System.out.println("第" + i + "月" + "一共有兔子:" + num);
        }
    }
}
