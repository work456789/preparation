package sorting;

import java.util.Arrays;

//O(nlogn) expected
//O(n^2) worst case
//O(1) space complexity -> this is inplace sorting algorithm
public class QuickSort {
    private static int numbers[];

    static void quickSort(int [] input, int start, int end) {
        if (input == null || input.length == 0) {
            return;
        }
        if (start < end) {
            int partitionIndex = partition(input, start, end);
            quickSort(input, start, partitionIndex-1);
            quickSort(input, partitionIndex+1, end);
        }
    }

    static int partition(int [] input, int start, int end) {
        int pivot = input[start];
        int pivotIndex = end;
        for (int i = end; i > start; i--) {
            if (input[i] >= pivot) {
                swap(i, pivotIndex);
                pivotIndex--;
            }
        }
        swap(pivotIndex, start);
        return pivotIndex;
    }

    private static void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length-1);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }
}
