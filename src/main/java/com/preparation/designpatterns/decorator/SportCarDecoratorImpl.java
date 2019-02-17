package com.preparation.designpatterns.decorator;

public class SportCarDecoratorImpl extends CarDecorator {
    private Car car;

    public SportCarDecoratorImpl(Car car) {
        this.car = car;
    }

    @Override
    public void goToWork() {
        car.goToWork();
        System.out.println("with double speed");
    }
}
