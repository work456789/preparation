package com.preparation.designpatterns.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarAbstractFactory carAbstractFactory = new CityCarFactory();
        Engine engine = carAbstractFactory.createEngine();
        Wheel wheel = carAbstractFactory.createWheel();
    }
}
