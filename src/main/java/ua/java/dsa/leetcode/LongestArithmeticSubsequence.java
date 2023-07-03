package ua.java.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSubsequence {
    public static void main(String[] args) {
        int[] input1 = {3, 6, 9, 12}; //4
        int[] input2 = {9, 4, 7, 2, 10}; //3
        int[] input3 = {20, 1, 15, 3, 10, 5, 8}; //4
        int[] input4 = {1,3}; //4

        System.out.println(longestArithmeticSeqLength(input1)); //4
        System.out.println(longestArithmeticSeqLength(input2)); //3
        System.out.println(longestArithmeticSeqLength(input3)); //4
        System.out.println(longestArithmeticSeqLength(input4)); //2
        System.out.println(longestArithSeqLength2(input1));
    }

    public static int longestArithmeticSeqLength(int[] nums) {
        int stepLength;
        int result = 0;
        int sequenceCount = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sequenceCount = 2;
                stepLength = nums[j] - nums[i];
                int lastSequenceElement = nums[j];
                System.out.println("Checking sequence between: '" + nums[i] + "' and '" + nums[j] + "' length=" + stepLength + ".");
                for (int k = j + 1; k < nums.length; k++) {
                    System.out.println("comparing_"+lastSequenceElement+"_&_"+ nums[k]);
                    if (nums[k] - lastSequenceElement == stepLength) {
                        System.out.println("added");
                        lastSequenceElement = nums[k];
                        sequenceCount++;
                    }
                }
                System.out.println("final seq size: " + sequenceCount);
                result = Math.max(result, sequenceCount);
            }
        }
        return result;
    }

    public static int longestArithSeqLength2(int[] nums) {

        int n = nums.length;
        Map<Integer,Integer>[] hm = new HashMap[n];
        // index, difference -> value

        int mx = 0;
        for (int i = 0;i < n;i++) {
            hm[i] = new HashMap<>();
            for (int j = 0;j < i;j++) {
                int diff = nums[i] - nums[j];
                hm[i].put(diff,hm[j].getOrDefault (diff,1) + 1);

                mx = Math.max (mx,hm[i].get (diff));
            }
        }
        return mx;

    }
}
