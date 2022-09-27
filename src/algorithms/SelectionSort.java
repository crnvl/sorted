package algorithms;

public class SelectionSort {
    public static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int min = i;
            for (int j = i; j < unsorted.length; j++) {
                if(unsorted[min] > unsorted[j])
                    min = j;
            }
            int temp = unsorted[min];
            unsorted[min] = unsorted[i];
            unsorted[i] = temp;
        }

        return unsorted;
    }
}
