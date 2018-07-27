package com.Prashant.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    public void trying() {
        list.stream().forEach(System.out::println);
        list.stream().map(i -> i * i).forEach(System.out::println);
        List<Integer> list1 = list.stream().map(i -> i * i).collect(Collectors.toList());
        list1.stream().forEach(System.out::println);

        List<String> strings = Arrays.asList("Prashant", "Gaurav");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
