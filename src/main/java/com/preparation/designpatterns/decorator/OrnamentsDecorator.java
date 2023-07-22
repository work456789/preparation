package com.preparation.designpatterns.decorator;

public class OrnamentsDecorator extends TreeDecorator {
    public OrnamentsDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public void decorate() {
        super.decorate();
        addOrnaments();
    }

    private void addOrnaments() {
        System.out.println("Added ornaments to the Christmas tree.");
    }
}
