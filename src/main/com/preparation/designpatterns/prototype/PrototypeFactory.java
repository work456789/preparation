package com.preparation.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, Employee> cloneMap = new HashMap<>();
    static {
        cloneMap.put("Gosho", new Employee("Gosho"));
    }
    public static Prototype getPrototype(String identifier) throws CloneNotSupportedException {
        return cloneMap.get(identifier).clone();
    }
}
