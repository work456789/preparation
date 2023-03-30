package com.preparation.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberToIndexMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int numberNeededToFormSum = target - nums[index];
            if (numberToIndexMap.containsKey(numberNeededToFormSum)) {
                return new int[]{index, numberToIndexMap.get(numberNeededToFormSum)};
            } else {
                numberToIndexMap.put(nums[index], index);
            }
        }
        return new int[]{};
    }
}
