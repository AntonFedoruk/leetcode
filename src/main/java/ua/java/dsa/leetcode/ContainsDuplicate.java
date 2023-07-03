package ua.java.dsa.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] inputF = {1, 2, 3, 4};
        int[] inputT = {1, 2, 3, 4, 2};
        int[] inputTT = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(inputF));
        System.out.println(containsDuplicate(inputT));
        System.out.println(containsDuplicate(inputTT));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (!numsSet.add(num)) {return true;}
        }

//        Arrays.sort(nums);
//        System.gc();
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i-1]){
//                return true;
//            }
//        }

        return false;
    }
}
