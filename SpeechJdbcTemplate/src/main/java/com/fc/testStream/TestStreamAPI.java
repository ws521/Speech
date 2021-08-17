package com.fc.testStream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamAPI {

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("4");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("4");
        list.forEach(System.out::println);
        Stream<String> stream = list.stream();
//
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("","");

//        Stream<String> limit = stream.limit(2);
//
//        limit.forEach(System.out::print);
//
//        Stream<String> stringStream = stream.filter((e) -> e.equals("1"));
//        stringStream.forEach(System.out::print);
//        stream.map((str) -> str.toUpperCase())
//                .forEach(System.out::print);
        List<String> list1 = stream.distinct().collect(Collectors.toList());
        list1.forEach(System.out::println);

    }

}
