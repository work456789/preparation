package sorting;

import java.util.Arrays;

//O(nlogn) expected
//O(n^2) worst case
public class QuickSort {
    private static int numbers[];

    static void quickSort(int [] input) {
        if (input == null || input.length == 0) {
            return;
        }
        partition(0, input.length - 1);
    }

    static void partition(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low)/2];

        while(i <= j) {
            while(numbers[i] < pivot) {
                i++;
            }

            while(numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            partition(low, j);
        }

        if(i < high){
            partition(i, high);
        }
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 8, 3, 5, 1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }
}
