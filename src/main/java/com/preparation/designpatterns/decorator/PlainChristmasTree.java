package com.preparation.designpatterns.decorator;

public class PlainChristmasTree implements ChristmasTree {
    @Override
    public void decorate() {
        System.out.println("A plain Christmas three.");
    }
}
