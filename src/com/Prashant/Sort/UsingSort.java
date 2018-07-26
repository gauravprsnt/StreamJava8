package com.Prashant.Sort;

import java.util.Arrays;
import java.util.List;

public class UsingSort {
    List<Integer> list= Arrays.asList(1,25,7,2,98,56);
    public void trying(){
        list.stream().sorted().forEach(System.out::println);
    }
}
