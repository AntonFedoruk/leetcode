package ua.java.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static ua.java.dsa.algorithms.sort.Utils.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        performanceTest();
    }

    public static void performanceTest() {
        ArrayList<Integer> generated = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            generated.add(i);
        }
        Collections.shuffle(generated);

        int[] array1 = generated.stream().mapToInt(i -> i).toArray();
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        int[] array3 = new int[array1.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        int[] array4 = new int[array1.length];
        System.arraycopy(array1, 0, array4, 0, array1.length);
        int[] array5 = new int[array1.length];
        System.arraycopy(array1, 0, array5, 0, array1.length);
        int[] array6 = new int[array1.length];
        System.arraycopy(array1, 0, array6, 0, array1.length);
        int[] array7 = new int[array1.length];
        System.arraycopy(array1, 0, array7, 0, array1.length);
        int[] array8 = new int[array1.length];
        System.arraycopy(array1, 0, array8, 0, array1.length);
        int[] array9 = new int[array1.length];
        System.arraycopy(array1, 0, array9, 0, array1.length);

        printArray(array1);

        measureTime(() -> bubbleSort(array1), "bubbleSort");
        measureTime(() -> bubbleSortOptimized(array2), "bubbleSortOptimized");
        Utils.assertTrue(Arrays.equals(array1, array2));

        System.out.println();

        measureTime(() -> bubbleSort(array3), "bubbleSort");
        measureTime(() -> bubbleSortOptimized(array4), "bubbleSortOptimized");

        System.out.println();

        measureTime(() -> bubbleSort(array5), "bubbleSort");
        measureTime(() -> bubbleSortOptimized(array6), "bubbleSortOptimized");
        measureTime(() -> QuickSort.quickSort(array7, 0, array7.length-1), "quickSort");
        Utils.assertTrue(Arrays.equals(array1, array7));
        measureTime(() -> MergeSort.mergeSort(array8), "mergeSort");
        Utils.assertTrue(Arrays.equals(array1, array8));
        measureTime(() -> MergeSort.mergeSort(array9), "combSort");
        Utils.assertTrue(Arrays.equals(array1, array9));

    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] array) {
        int k = 1;
        int len = array.length;
        while (k > 0) {
            k = 0;
            for (int i = 1; i < len; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    k = i;
                }
            }
            len = k;
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print("'" + j + "' ");
        }
        System.out.println();
    }
}
