package com.Prashant.DefaultMethods;

public class Car implements Vehicle,TwoWheeler {

    @Override
    public void print() {
        Vehicle.super.print();
        TwoWheeler.super.print();
        Vehicle.printName();
        System.out.println("I m Bike..");
    }
}
