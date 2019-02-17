package com.preparation.sorting;

import java.util.Arrays;

//time complexity O(nlogn) worst case
//space complexity O(n)
//https://www.youtube.com/watch?v=TzeBrDU-JaY
public class MergeSort {
    private static int numbers[];

    static void merge(int [] left, int [] right, int [] array) {
        int sizeL = left.length;
        int sizeR = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < sizeL && j < sizeR) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < sizeL) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < sizeR) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int [] input) {
        int n = input.length;
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = input[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = input[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, input);
    }

    public static void main(String[] args) {
        numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }


}
