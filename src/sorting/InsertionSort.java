package sorting;

import java.util.Arrays;

//Time complexity O(n^2) n average and worst case
//Space complexity - constant (this is in place algorithm)
public class InsertionSort {
    private static void swap(int [] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        int [] numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Bubble Sorting : ");
        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("==================");
        System.out.println("After Bubble Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }

    static void insertionSort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int valueAtPosition = arr[i];
            int positionToPut = i;
            while (positionToPut > 0 && arr[positionToPut-1] > valueAtPosition) {
                 arr[positionToPut] = arr[positionToPut-1];
                 positionToPut = positionToPut - 1;
            }
            arr[positionToPut] = valueAtPosition;
        }
    }
}
