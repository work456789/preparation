package com.preparation.designpatterns.factory.factorymethod;

public class PublicTransportCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Ikarus();
    }
}
