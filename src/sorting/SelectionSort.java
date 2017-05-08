package sorting;

import java.util.Arrays;

//Time complexity O(n^2)
//Space complexity - constant (this is in place algorithm)
public class SelectionSort {
    private static void swap(int [] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        int [] numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 3, 5, 1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(numbers));
    }

    static void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            swap(arr, i , indexOfMin);
        }
    }
}
