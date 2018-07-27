package com.Prashant.DefaultMethods;

public interface Vehicle {
    default void print(){
        System.out.println("Vehicle...");
    }

    static void printName(){
        System.out.println("ashdfasd");
    }


}
