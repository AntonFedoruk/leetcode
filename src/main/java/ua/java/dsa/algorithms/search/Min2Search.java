package ua.java.dsa.algorithms.search;

public class Min2Search {
    public static void main(String[] args) {
        int[] array = new int[]{64, 64, 64, 64};
//        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        int min = array[0], min2 = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] != min) {
                min2 = array[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("min2: " + min2);
    }
}
