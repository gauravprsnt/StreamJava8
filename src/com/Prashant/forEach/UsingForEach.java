package com.Prashant.forEach;

import java.util.Arrays;
import java.util.List;

public class UsingForEach {
    public void trying() {
        List<String> strings = Arrays.asList("Prashant", "Nabin", "Mohendra", "Aakash");
        strings.forEach(System.out::println);
    }
}
