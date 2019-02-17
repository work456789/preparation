package com.preparation.designpatterns.abstractfactory;

public interface CarAbstractFactory {
    Engine createEngine();
    Wheel createWheel();
}
