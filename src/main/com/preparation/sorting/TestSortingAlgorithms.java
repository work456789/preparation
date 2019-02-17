package com.preparation.sorting;

import java.util.Arrays;

public class TestSortingAlgorithms {
    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        int [] numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length-1);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }

    //Write quick sort from scratch//
    static void quickSort(int[] input, int start, int end) {
        if (input == null || input.length < 2) {
            return;
        }
        int mid = start + (end-start)/2;
        int pivot = input[mid];

        int i = start, j = end;
        while (i <= j) {
            while (input[i] < pivot) {
                i++;
            }

            while (input[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (start < j) {
        quickSort(input, start, j);
        }
        if (i < end) {
        quickSort(input, i, end);
        }
    }

    //Write merge sort from scratch//
    static void merge(int[] input, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int sizeLeft = left.length;
        int sizeRight = right.length;
        while (i < sizeLeft && j < sizeRight) {
            if (left[i] < right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < sizeLeft) {
            input[k] = left[i];
            i++;
            k++;
        }
        while (j < sizeRight) {
            input[k] = right[j];
            j++;
            k++;
        }
    }

}
