package ua.java.dsa.leetcode;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j' };
        char target1 = 'a';
        char target2 = 'c';
        char target4 = 'd';
        char[] letters2 = {'x', 'x', 'y', 'y' };
        char target3 = 'z';
//        System.out.println(nextGreatestLetter(letters1, target1));
        System.out.println(nextGreatestLetter(letters1, target4));
        System.out.println(nextGreatestLetter2(letters1, target4));
//        System.out.println(nextGreatestLetter(letters1, 'j'));
//        System.out.println(nextGreatestLetter(letters2, target3));
//        System.out.println(nextGreatestLetter(letters2, 'x'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int startIndex = 0, endIndex = letters.length - 1, middleIndex;
        char result = letters[0];
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (letters[middleIndex] > target) {
                endIndex = middleIndex - 1;
                result = letters[middleIndex];
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return result;
    }


    public static char nextGreatestLetter2(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int i = 0;
        while (letters[i] <= target) i++;
        System.gc();
        return letters[i];
    }
}
