package com.preparation.designpatterns.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Programmer programmer = new NormalProgrammer();
        Programmer softSkillsProgrammer = new SoftSkillsProgrammer(programmer);
        softSkillsProgrammer.code();
    }
}
