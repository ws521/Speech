package com.fc.testIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testTxt {
    //读取文件
    public List<String> ReadFile() {
        File file = new File("D:\\桌面\\1号迷宫(0,18).txt");
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            while ((s = br.readLine()) != null) {//使用readline方法一次读一行
                list.add(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public int[][] SplitString(List list){
        int[][] dd = {{0,1},{1,0},{0,-1},{-1,0}};//右，下，左，上，四个方向





        return null;
    }


    public static void main(String[] args) {

    }
}
