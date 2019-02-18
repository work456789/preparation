package com.preparation.designpatterns.factory.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
}
