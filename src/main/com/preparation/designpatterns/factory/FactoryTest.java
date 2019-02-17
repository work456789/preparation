package com.preparation.designpatterns.factory;

public class FactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new SportsCarFactory();
        Car car = carFactory.createCar();
        System.out.println(car.toString());
    }
}
