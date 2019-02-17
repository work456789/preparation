package com.preparation.designpatterns.factory;

public class SportsCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
