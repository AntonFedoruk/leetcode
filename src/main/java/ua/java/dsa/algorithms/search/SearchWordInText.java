package ua.java.dsa.algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchWordInText {

    public static void main(String[] args) {
        String text = "aabaabaaaaaabaabaabaabbaaab";
        String word = "aabaab";

        System.out.println(Arrays.toString(searchNaive(text, word).toArray()));
        System.out.println(Arrays.toString(prefixFunction(word)));
        System.out.println(Arrays.toString(KMPSearch(text, word).toArray()));
    }

    public static ArrayList<Integer> searchNaive(String text, String sample) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            while (j < sample.length() &&
                    i + j < text.length() &&
                    sample.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == sample.length()) {
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }


    public static int[] prefixFunction(String sample) {
        int[] values = new int[sample.length()];
        for (int i = 1; i < sample.length(); i++) {
            int j = 0;
            while (i + j < sample.length() &&
                    sample.charAt(j) == sample.charAt(i + j)) {
                values[i + j] = Math.max(values[i + j], j + 1);
                j++;
            }
        }
        return values;
    }

    public static ArrayList<Integer> KMPSearch(String text, String sample) {
        ArrayList<Integer> found = new ArrayList<>();
        int[] prefixFunc = prefixFunction(sample);

        int i = 0, j = 0;

        while (i < text.length()) {
            if (sample.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == sample.length()) {
                found.add(i - j);
                j = prefixFunc[j - 1];
            } else if (i < text.length() && sample.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = prefixFunc[j - 1];
                } else {
                    i++;
                }
            }
        }
        return found;
    }

}
