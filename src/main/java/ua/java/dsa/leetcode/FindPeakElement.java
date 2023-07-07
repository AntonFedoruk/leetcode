package ua.java.dsa.leetcode;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
        System.out.println(findPeakElement(new int[]{3, 2, 1, 2}));
        System.out.println(findPeakElement(new int[]{3, 2, 1, 4}));
        System.out.println(findPeakElement(new int[]{1, 2, 3}));
        System.out.println(findPeakElement(new int[]{4, 2, 3}));
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println(findPeakElement(new int[]{3, 4, 3, 2, 1}));
        System.out.println(findPeakElement(new int[]{2, 1, 3, 4, 3}));
    }

    public static int findPeakElement(int[] nums) {
        int length = nums.length;
        if(length == 1 || nums[0] > nums[1]) return 0;
        if(nums[length - 1] > nums[length - 2]) return length - 1;

        int startIndex = 0, midIndex, endIndex = length - 1;
        while (startIndex <= endIndex) {
            midIndex = startIndex + (endIndex - startIndex) / 2;

            if (midIndex > 0 && midIndex < length) {
                if (nums[midIndex] > nums[midIndex - 1] && nums[midIndex] > nums[midIndex + 1]) {
                    return midIndex;
                } else if (nums[midIndex] < nums[midIndex + 1]) {
                    startIndex = midIndex + 1;
                } else if (nums[midIndex] < nums[midIndex - 1]) {
                    endIndex = midIndex - 1;
                }
            }
            else if (midIndex == 0) {
                if (nums[midIndex] > nums[midIndex + 1]) return midIndex;
                else startIndex = midIndex + 1;
            }
//            else if (midIndex == length - 1) {
//                if (nums[length - 2] < nums[midIndex]) return midIndex;
//                else endIndex = midIndex - 1;
//            }
        }
        return -1;
    }
}
