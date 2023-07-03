package ua.java.dsa.algorithms.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 41, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

//        printArray(array);

//        System.out.println("****************************************");

        mergeSort(array);
    }

    private static void merge(int[] srcA, int srcAStart,
                              int[] srcB, int srcBStart,
                              int[] dest, int destStart,
                              int size) {
        int indexA = srcAStart;
        int indexB = srcBStart;

        int srcAEnd = Math.min(srcAStart + size, srcA.length);
        int srcBEnd = Math.min(srcBStart + size, srcB.length);

        int iterationCount = srcAEnd - srcAStart + srcBEnd - srcBStart;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (indexA < srcAEnd && (indexB >= srcBEnd || srcA[indexA] < srcB[indexB])) {
                dest[i] = srcA[indexA];
                indexA++;
            } else {
                dest[i] = srcB[indexB];
                indexB++;
            }
        }
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;


//            System.out.println("Size: " + size + " CurrentSrc:");
//            printArray(currentSrc);

            size = size * 2;
        }

        return currentSrc;
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print("'" + j + "' ");
        }
        System.out.println();
    }
}
