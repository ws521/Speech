package com.fc.testClose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo implements Cloneable {
    private Integer id;
    private String name;
    private Cat cat;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {

        new CountDownLatch(5);

        Cat cat = new Cat();
        cat.setId(1);
        cat.setName("BYD");
        Demo demo = new Demo();
        demo.setName("张三");
        demo.setCat(cat);
        demo.setDate(new Date());
        Cat cat1 = demo.getCat();
        cat1.setName("LH");
        cat1.setId(2);
        demo.setId(1);
        System.out.println(new Date());
            Thread.sleep(2000);
            Demo clone = (Demo) demo.clone();
            System.out.println(demo);
            System.out.println(clone);
            clone.setCat(cat1);
            clone.setName("赵四");
            clone.setId(2);
            clone.setDate(new Date());
            System.out.println(new Date());
            System.out.println(demo);
            System.out.println(clone);
    }
}
