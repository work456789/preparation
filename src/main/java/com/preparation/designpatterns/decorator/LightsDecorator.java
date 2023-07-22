package com.preparation.designpatterns.decorator;

public class LightsDecorator extends TreeDecorator {
    public LightsDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public void decorate() {
        super.decorate();
        addLights();
    }

    private void addLights() {
        System.out.println("Added lights to the Christmas tree.");
    }
}
