package com.preparation.designpatterns.factory.abstractfactory;

public class SportCarFactory implements CarFactory {
    public Engine createEngine() {
        return new SportsEngine();
    }

    public Wheel createWheel() {
        return new SportsWheel();
    }
}
