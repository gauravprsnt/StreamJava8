package com.Prashant.Limit;

import java.util.Arrays;
import java.util.List;

public class UsingLimit {
    public void trying() {
        List<Integer> list = Arrays.asList(1, 25, 7, 2, 98, 56, 4, 5, 8, 4, 2);
        list.stream().limit(5).forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4})
                .average()
                .ifPresent(System.out::println);
    }
}
