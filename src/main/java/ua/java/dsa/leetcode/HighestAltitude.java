package ua.java.dsa.leetcode;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println("highest altitude: " + largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0, prevHeight = 0;
        for (int netGain : gain) {
            prevHeight = prevHeight + netGain;
            if (max < prevHeight) {
                max = prevHeight;
            }
        }
        return max;
    }
}
