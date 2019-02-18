package com.preparation.designpatterns.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new PublicTransportFactory();
        Engine engine = carFactory.createEngine();
        Wheel wheel = carFactory.createWheel();
    }
}
