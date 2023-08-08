package com.preparation.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = new String[]{"addsad", "addddsa"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;
        while (idx < first.length() && idx < last.length()) {
            if (first.charAt(idx) != last.charAt(idx)) {
                break;
            }
            idx++;
        }
        return first.substring(0, idx);
    }

}
