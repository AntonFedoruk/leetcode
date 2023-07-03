package ua.java.dsa.leetcode;

public class MissingNumber {
    public static void main(String[] args) {
//        System.out.println(missingNumber(new int[]{3,0,1}));
//        System.out.println(missingNumber(new int[]{0,1}));
//        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
//        System.out.println(missingNumber(new int[]{0}));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int sumShouldBe = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumShouldBe += i;
        }
        sumShouldBe += nums.length;
        return sumShouldBe - sum;
    }

    public static int missingNumber2(int[] nums) {
        int sumShouldBe = (int) (nums.length*(nums.length+1)*0.5);
        for (int i = 0; i < nums.length; i++) {
            sumShouldBe -= nums[i];
        }
        return sumShouldBe;
    }
}
