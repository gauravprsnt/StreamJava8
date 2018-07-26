package com.Prashant.UsingStreamDifferently;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public   class UsingStreamDifferently {
    public static void trying(){
        Arrays.asList("Prashant","Mohendra","Nabin")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("Ktm","Brt","Pkr")
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.of(1,2,3,4,5,6,7)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new int[]{2,3,4,5,6,7})
                .map(n->2*n+1)
                .forEach(System.out::println);
    }
}
