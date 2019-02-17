package com.preparation.designpatterns.prototype;

public class Employee implements Prototype {
    private String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Loading heavy data from database");
        System.out.println("Checking data with remote services via HTTP");
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getName() {
        return name;
    }
}
