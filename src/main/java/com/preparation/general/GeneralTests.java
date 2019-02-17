package com.preparation.general;

import java.util.ArrayList;
import java.util.List;

public class GeneralTests {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        System.out.println(a);
        System.out.println(b);

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

    }
}
