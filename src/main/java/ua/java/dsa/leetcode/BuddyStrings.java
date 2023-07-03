package ua.java.dsa.leetcode;

public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("abac","abad"));
//        System.out.println(buddyStrings("abzx","bazx"));
//        System.out.println(buddyStrings("abzx","bazc"));
//        System.out.println(buddyStrings("ab","ba"));
//        System.out.println(buddyStrings("ab","ab"));
//        System.out.println(buddyStrings("abb","abb"));
//        System.out.println(buddyStrings("aaaaaaabeeec", "aaaaaaaceeeb"));
//        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
//        System.out.println((char) 97);
//        System.out.println((char) 122);
//        System.out.println(97 -'b');
    }

    public static boolean buddyStrings(String s, String goal) {
        boolean containRepetition = false;
        int[] chars = new int[26];
        int swapCandidate1Index = -1, swapCandidate2Index;
        for (int i = 0; i < s.length(); i++) {
            if (goal.charAt(i) != s.charAt(i)) {
                if (swapCandidate1Index == -1) {
                    swapCandidate1Index = i;
                } else {
                    swapCandidate2Index = i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(s.substring(0, swapCandidate1Index));
                    sb.append(s.charAt(swapCandidate2Index));
                    sb.append(s.substring(swapCandidate1Index + 1, swapCandidate2Index));
                    sb.append(s.charAt(swapCandidate1Index));
                    sb.append(s.substring(swapCandidate2Index + 1));
                    return sb.toString().equals(goal);
                }
            }
            if (++chars[s.charAt(i) - 97] > 1) {
                containRepetition = true;
            }
        }
        if (swapCandidate1Index != -1) {
            return false;
        }
        return containRepetition;
    }
}
