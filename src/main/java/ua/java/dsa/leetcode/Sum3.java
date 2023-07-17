package ua.java.dsa.leetcode;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to easily handle duplicates and perform two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    // Found a triplet that sums up to zero
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(triplet);

                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // Move the pointers
                    left++;
                    right--;
                }
            }
        }

        return result;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        integers.sort(Integer::compareTo);
                        result.add(integers);
                    }
                }
            }

        }
        return new ArrayList<>(result);
    }
}
