package ua.java.dsa.algorithms.sort;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        combSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void combSort(int[] array) {
        int gap = array.length;

        boolean isSorted = false;

        while (!isSorted || gap != 1) {
            if (gap > 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            isSorted = true;
            for (int i = gap; i < array.length; i += gap) {
                if (array[i] < array[i - gap]) {
                    int temp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
