package com.fc.testClose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openjdk.jol.info.ClassLayout;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    private int id;
    private String name;

    public static void main(String[] args) {
        String s = ClassLayout.parseInstance(Cat.class).toPrintable();

        System.out.println(s);
    }
}
