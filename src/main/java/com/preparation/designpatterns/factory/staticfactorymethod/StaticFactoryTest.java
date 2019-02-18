package com.preparation.designpatterns.factory.staticfactorymethod;

public class StaticFactoryTest {
    public static void main(String[] args) {
        Car car = Car.getInstance("Ferrari");
    }
}
