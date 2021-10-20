package com.preparation.designpatterns.decorator;

public class SoftSkillsProgrammer extends NormalProgrammer {

    public SoftSkillsProgrammer(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void code() {
        super.code();
        System.out.println("Doing Soft Skills");
    }
}
