package ua.java.dsa.leetcode;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        getAverages(nums, k);
        getAverages2(nums, k);

        System.out.println("equal???");
        System.out.println(getAverages(nums, k) == getAverages2(nums, k));
        int[] nums2 = new int[10_000];
        Arrays.fill(nums2, 100);
        int k2 = 40000;
        System.out.println("asdas");
        getAverages(nums2, k2);
        System.out.println("12312");
        getAverages2(nums2, k2);
        System.out.println("equal???");
        System.out.println(getAverages(nums2, k2) == getAverages2(nums2, k2));
    }

    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        long sum = 0;
        int length = 2 * k + 1;
        if (length > n) return ans;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }
        ans[k] = (int) (sum / length);
        int start = 0;
        for (int last = length; last < n; last++) {
            sum = sum - nums[start] + nums[last];
            start++;
            ans[last - k] = (int) (sum / length);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static int[] getAverages2(int[] nums, int k) {
        int n = nums.length, areaSize = k * 2 + 1;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        if (n < areaSize) return result;

        long sumWithinKRadius = 0;
        for (int i = 0; i < n; i++) {
            sumWithinKRadius += nums[i];

            if (i - areaSize >= 0) {
                sumWithinKRadius -= nums[i - areaSize];
            }

            if (i >= areaSize - 1) {
                result[i - k] = (int) (sumWithinKRadius / areaSize);
            }
        }
        return result;
    }
}
