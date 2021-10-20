package com.preparation.designpatterns.decorator;

public class NormalProgrammer implements Programmer {

    public NormalProgrammer() {}

    public NormalProgrammer(Programmer programmer) {}

    @Override
    public void code() {
        System.out.println("Coding");
    }
}
