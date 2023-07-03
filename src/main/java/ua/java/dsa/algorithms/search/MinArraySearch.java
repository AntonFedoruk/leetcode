package ua.java.dsa.algorithms.search;

public class MinArraySearch {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        System.out.println("minValue: " + minValue);
        System.out.println("minIndex: " + minIndex);
    }
}
