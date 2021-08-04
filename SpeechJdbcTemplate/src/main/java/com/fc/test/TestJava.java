package com.fc.test;

import java.lang.reflect.Field;

public class TestJava {
    public static void main(String[] args) {
        Class studentClass = null;
        try {
            studentClass = Class.forName("com.fc.test.Student");
            Object obj = studentClass.newInstance(); // obj就是Student对象。（底层调用无参数构造方法）

            // ----------------------------------------------------
            // 可以访问私有的属性吗？
            Field nameField = studentClass.getDeclaredField("name");

            // 打破封装（反射机制的缺点：打破封装，可能会给不法分子留下机会！！！）-暴力访问
            // 这样设置完之后，在外部也是可以访问private的。
            nameField.setAccessible(true);

            // 给name属性赋值
            nameField.set(obj, "易烊千玺");
            // 获取name属性的值
            System.out.println(nameField.get(obj));

    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
