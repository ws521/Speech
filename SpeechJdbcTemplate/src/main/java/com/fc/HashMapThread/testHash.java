package com.fc.HashMapThread;

import org.springframework.validation.annotation.Validated;

import java.util.HashMap;

//@Validated
@Validated
public class testHash {
    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static void main(String[] args) {
        //都是1
        //&取与 如 6&5 00110&00101 = 00100 = 4
        System.out.println(6 & 5);
        //|取或 如 6|5 00110|00101 = 00111 = 7
        System.out.println(6 | 5);
        //^取异或 如 6^5 00110|00101 = 00011 = 3
        System.out.println(6 ^ 5);
    }
}
