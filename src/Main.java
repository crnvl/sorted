import algorithms.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = new int[]{21, 456, 23, 1, 21, 42, 64, 5};

        System.out.println("Before: " + Arrays.toString(unsorted));

        int[] sorted = QuickSort.sort(unsorted);

        System.out.println("After: " + Arrays.toString(sorted));
    }
}
