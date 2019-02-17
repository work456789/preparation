package com.preparation.sorting;

import java.util.Arrays;

//Time complexity O(n^2)
//Space complexity - constant (this is in place algorithm)
public class BubbleSort {
    private static void swap(int [] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        int [] numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Bubble Sorting : ");
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("==================");
        System.out.println("After Bubble Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }

    static void bubbleSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
