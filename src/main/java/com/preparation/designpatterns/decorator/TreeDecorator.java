package com.preparation.designpatterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    protected ChristmasTree decoratedChristmasTree;

    public TreeDecorator(ChristmasTree decoratedChristmasTree) {
        this.decoratedChristmasTree = decoratedChristmasTree;
    }

    @Override
    public void decorate() {
        decoratedChristmasTree.decorate();
    }
}
