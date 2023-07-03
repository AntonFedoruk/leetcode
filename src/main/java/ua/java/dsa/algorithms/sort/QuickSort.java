package ua.java.dsa.algorithms.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        printArray(array);
        quickSort(array, 0, array.length -1);
//        test();
//        test1();
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int divideIndex = partition(array, from, to);
//            printSortStep(array, from, to, divideIndex);
            //left part
            quickSort(array, from, divideIndex - 1);
            //right part
            quickSort(array, divideIndex, to);
        }

    }

    private static void printSortStep(int[] array, int from, int to, int divideIndex) {
        printArray(array);
        System.out.println("partition at index:" + divideIndex +
                ", left: " + Arrays.toString(Arrays.copyOfRange(array, from, divideIndex - 1)) +
                ", right: " + Arrays.toString(Arrays.copyOfRange(array, divideIndex - 1, to)));
        System.out.println();
    }

    private static int partition(int[] array, int from, int to) {
        int rightIndex = to, leftIndex = from;
        //base element
        int pivot = array[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print("'" + j + "' ");
        }
        System.out.println();
    }

    private static void test() {
        int testLen = 100_000;
        int[] arrA = new int[testLen];
        int[] arrB = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            arrA[i] = arrB[i] = (int) Math.round(Math.random() * 10_000);
        }

        System.out.println("QuickSort:");
        measureTime(() -> quickSort(arrA, 0, arrA.length - 1));

        System.out.println("BubbleSort:");
        measureTime(() -> bubbleSort(arrB));

    }

    private static void test1() {
        int testLen = 100_000_000;
        int[] arrA = new int[testLen];
        int[] arrB = new int[testLen];
        for (int i = 0; i < testLen; i++) {
            arrA[i] = arrB[i] = (int) Math.round(Math.random() * 10_000);
        }

        System.out.println("QuickSort:");
        measureTime(() -> quickSort(arrA, 0, arrA.length - 1));

        System.out.println("MergeSort:");
        measureTime(() -> MergeSort.mergeSort(arrB));
    }

    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println("It takes : " + (endTime - startTime) + "millis to complete.");
    }

    private static void bubbleSort(int[] array) {
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
}
