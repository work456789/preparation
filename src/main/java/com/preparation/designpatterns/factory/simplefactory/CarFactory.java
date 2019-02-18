package com.preparation.designpatterns.factory.simplefactory;

public class CarFactory {
    public CarFactory() {

    }

    public Car getCar(String type) {
        //here choose which car you want
        if ("Ferrai".equalsIgnoreCase(type)) {
            return new Ferrari();
        } else if ("Mustang".equalsIgnoreCase(type)) {
            return new Mustang();
        }

        return null;
    }
}
