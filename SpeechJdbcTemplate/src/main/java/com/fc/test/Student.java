package com.fc.test;

public class Student {

    private String name="易烊千玺";



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

}
