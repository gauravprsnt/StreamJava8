package com.Prashant.Filter;

import java.util.Arrays;
import java.util.List;

public class UsingFilter {
    List<String> list= Arrays.asList("Prashant","Nabin","Presit","Pawan");
    public void trying(){
        list.stream().filter(string->string.startsWith("N")).forEach(System.out::println);
    }

}
