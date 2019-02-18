package com.preparation.designpatterns.factory.staticfactorymethod;

public class Car {
    private String model;

    private Car(String model) {
        this.model = model;
    }

    static Car getInstance(String model) {
        return new Car(model);
    }
}
