package com.preparation.designpatterns.factory.abstractfactory;

public class PublicTransportFactory implements CarFactory {
    public Engine createEngine() {
        return new PublicTransportEngine();
    }

    public Wheel createWheel() {
        return new PublicTransportWheel();
    }
}
