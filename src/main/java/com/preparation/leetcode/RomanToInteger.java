package com.preparation.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static Map<Character, Integer> mapRomanToInt;
    static {
        mapRomanToInt = new HashMap<>();

        mapRomanToInt.put('I', 1);
        mapRomanToInt.put('V', 5);
        mapRomanToInt.put('X', 10);
        mapRomanToInt.put('L', 50);
        mapRomanToInt.put('C', 100);
        mapRomanToInt.put('D', 500);
        mapRomanToInt.put('M', 1000);
    }

    public static void main(String[] args) {
        RomanToInteger toInteger = new RomanToInteger();
        System.out.println(toInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String input) {

        int totalSum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i < (input.length() - 1) && getIntFromRomanChar(input.charAt(i+1)) > getIntFromRomanChar(input.charAt(i))) {
                totalSum = totalSum - getIntFromRomanChar(input.charAt(i));
            } else {
                totalSum = totalSum + getIntFromRomanChar(input.charAt(i));
            }
        }

        return totalSum;
    }

    public int getIntFromRomanChar(char roman) {
        return mapRomanToInt.get(roman);
    }
}
