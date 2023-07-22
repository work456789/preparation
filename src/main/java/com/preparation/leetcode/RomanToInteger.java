package com.preparation.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger toInteger = new RomanToInteger();
        toInteger.romanToInt("XX");
    }

    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length; i++) {
    if (i == 0) {

    }
        }
return 0;
    }
}
