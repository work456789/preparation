package sorting;

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

    static void partition(int left, int right) {

    }

    public static void main(String args[]){
//        numbers = new int[]{33, 21, 45, 64, 55, 34, 11, 8, 3, 5, 1};
//        System.out.println("Before Sorting : ");
//        System.out.println(Arrays.toString(numbers));
//        QuickSort quickSort = new QuickSort();
//        quickSort(numbers);
//        System.out.println("==================");
//        System.out.println("After Sorting : ");
//        System.out.println(Arrays.toString(numbers));
        Integer a = 50;
        Integer b = 50;
        a.equals(b);
       // System.out.println(a == b);

        Long c = 100L;
        Long d = 100L;
        System.out.println(c == d);
    }
}
