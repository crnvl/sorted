package algorithms;

public class BubbleSort {
    public static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length - 1; j++) {
                if(unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }

        return unsorted;
    }
}
