package ua.java.dsa.leetcode;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
//        System.out.println(singleNumber(new int[]{2,2,1}));
//        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber2(new int[]{4,1,2,1,2}));
//        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
            }
        }
        return set.stream().findFirst().get();
    }

    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans = ans^nums[i];
            System.out.println(ans);
        }
        return ans;

    }
}
