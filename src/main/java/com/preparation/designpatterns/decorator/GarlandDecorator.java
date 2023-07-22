package com.preparation.designpatterns.decorator;

public class GarlandDecorator extends TreeDecorator{
    public GarlandDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public void decorate() {
        super.decorate();
        addGarlands();
    }

    private void addGarlands() {
        System.out.println("Added garlands to the Christmas tree.");
    }
}
