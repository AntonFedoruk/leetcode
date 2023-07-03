package ua.java.dsa.leetcode;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
//        System.out.println(fizzBuzz(3));
//        System.out.println(fizzBuzz(5));
//        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz2(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static List<String> fizzBuzz2(int n) {

        return new FizzBuzzer(n);
    }

    private static final class FizzBuzzer extends AbstractList<String> implements RandomAccess {

        private final int size;

        FizzBuzzer(int n) {
            this.size = n;
        }

        public String get(int i) {

            int n = i+1;
            if( n%15 == 0) {
                System.gc();
                return "FizzBuzz";
            }
            if( n%3 == 0) {
                return "Fizz";
            }
            if( n%5 == 0) {
                return "Buzz";
            }
            return Integer.toString(n);
        }

        public int size() {
            return this.size;
        }

    }
}
