package ua.java.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximizeTheConfusionOfAnExam {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers2("TTFF", 2));
        System.out.println(maxConsecutiveAnswers2("TFFT", 1));
        System.out.println(maxConsecutiveAnswers2("TTFTTFTT", 1));
        System.out.println(maxConsecutiveAnswers2("TTTTTFTFFT", 2));
        System.out.println(maxConsecutiveAnswers2("FFTFTFTFFT", 6));

    }

    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int maxFreq = 0;
        int i = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for (int j = 0; j < answerKey.length(); j++) {
            char currentChar = answerKey.charAt(j);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, charCount.get(currentChar));

            int windowLength = j - i + 1;
            int gap = maxFreq + k;
            if (windowLength > gap) {
                charCount.put(answerKey.charAt(i), charCount.get(answerKey.charAt(i)) - 1);
                i++;
            }
        }
        return answerKey.length() - i;
    }

    public static int maxConsecutiveAnswers2(String answerKey, int k) {
        int[] answers = {0, 0};
        int start = 0, end = 0, count = 0;
        while (end < answerKey.length()) {
            if (answerKey.charAt(end) == 'F') answers[0] += 1;
            else answers[1] += 1;
            while (Math.min(answers[0], answers[1]) > k) {
                if (answerKey.charAt(start) == 'F') answers[0] -= 1;
                else answers[1] -= 1;
                start += 1;
            }
            int windowLength = end - start + 1;
            count = Math.max(windowLength, count);
            end += 1;
        }
        return count;
    }

}
