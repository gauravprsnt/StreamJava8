package com.Prashant.DefaultMethods;

public interface TwoWheeler {
    default void print(){
        System.out.println("I am 2 wheeler");
    }
}
