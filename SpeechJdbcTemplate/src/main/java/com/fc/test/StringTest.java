package com.fc.test;

public class StringTest implements UserFactory{
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        try {

            Student student = new Student();

            Class<? extends Student> aClass1 = student.getClass();

            Class<?> aClass = Class.forName("com.fc.test.Student");

            System.out.println(studentClass);
            System.out.println(aClass);
            System.out.println(aClass1);
            System.out.println(studentClass==aClass);
            System.out.println(aClass1==aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Student get(String name) {
        return null;
    }
}
