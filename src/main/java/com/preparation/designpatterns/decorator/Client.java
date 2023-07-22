package com.preparation.designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        ChristmasTree tree = new PlainChristmasTree();

        tree = new LightsDecorator(tree);
        tree = new OrnamentsDecorator(tree);
        tree = new GarlandDecorator(tree);

        tree.decorate();
    }
}
