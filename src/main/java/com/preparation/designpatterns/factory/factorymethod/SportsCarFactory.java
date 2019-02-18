package com.preparation.designpatterns.factory.factorymethod;

public class SportsCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Ferrari();
    }
}
