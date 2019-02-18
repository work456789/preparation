package com.preparation.designpatterns.factory.factorymethod;

public class FactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new SportsCarFactory();
        Car car = carFactory.createCar();
        car.drive();
        carFactory = new PublicTransportCarFactory();
        car = carFactory.createCar();
        car.drive();
    }
}
