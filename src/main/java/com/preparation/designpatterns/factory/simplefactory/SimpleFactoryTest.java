package com.preparation.designpatterns.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("Ferrari");
    }
}
