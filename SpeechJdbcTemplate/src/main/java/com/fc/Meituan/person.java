package com.fc.Meituan;

import java.util.Comparator;
import java.util.Objects;

public class person implements Comparator<person> {
    private Integer id;
    private Integer age;
    private Integer height;


    @Override
    public int compare(person o1, person o2) {
        //比较年龄
        if (o1.getAge().equals(o2.getAge())) {
            //比较身高
            if (o1.getHeight().equals(o2.getHeight())) {
                return o2.getId() - o1.getId();
            }
            return o2.getHeight() - o1.getHeight();
        }
        return o1.getAge() - o2.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public person() {

    }

    public person(Integer id, Integer age, Integer height) {
        this.id = id;
        this.age = age;
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
