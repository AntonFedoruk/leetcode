package ua.java.dsa.algorithms.sort;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        printArray(array);

        for (int step = 0; step < array.length; step++) {
            int index = minIndex(array, step);
            int temp = array[index];
            array[index] = array[step];
            array[step] = temp;
            printArray(array);
        }
    }

    private static int minIndex(int[] array, int start) {
        int minVal = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print("'" + j + "' ");
        }
        System.out.println();
    }
}