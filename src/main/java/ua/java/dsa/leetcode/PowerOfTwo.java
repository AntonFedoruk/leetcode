package ua.java.dsa.leetcode;

import java.util.HashSet;
import java.util.Set;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(1));
        System.out.println(isPowerOfTwo1(2));
        System.out.println(isPowerOfTwo1(-2));
        System.out.println(isPowerOfTwo1(3));
        System.out.println(isPowerOfTwo1(217));
        System.out.println(isPowerOfTwo1(32768));
    }

    public static boolean isPowerOfTwo1(int n) {
        return (n > 0) && (n & (n-1)) == 0;
    }
    public static boolean isPowerOfTwo2(int n) {
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else if(n%2==0 && isPowerOfTwo2(n/2)){
            return true;
        }else
            return false;
    }

}
