package ua.java.dsa.algorithms.sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        countSort(array);
        System.out.println(Arrays.toString(array));

        test();
    }

    public static void countSort(int[] array) {
        final int MAX_VALUE = 100;
        int[] count = new int[MAX_VALUE];

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }

    private static void test() {
        int testLen = 1_000_000_0;
        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("quick sort and count sort comparing");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = (int) Math.round(Math.random() * 99);
        }

        System.out.println("quick sort");
        QuickSort.measureTime(() -> QuickSort.quickSort(arr1, 0, testLen-1));

        System.out.println("count sort");
        QuickSort.measureTime(() -> countSort(arr2));
    }
}
