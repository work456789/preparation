package com.preparation.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> uniqueCharacters = new HashSet<>();
        while (end < s.length()) {
            if (uniqueCharacters.contains(s.charAt(end))) {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            } else {
                uniqueCharacters.add(s.charAt(end));
                maxLength = Math.max(maxLength, uniqueCharacters.size());
                end++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("asdsdac"));
    }
}
