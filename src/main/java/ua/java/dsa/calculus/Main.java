package ua.java.dsa.calculus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getInRadix(7, 2));
        System.out.println(getInRadix(7, 10));
        System.out.println(getInRadix(255, 2));
        System.out.println(getInRadix(255, 16));
    }

    public static String getInRadix(int number, int radix) {
        List<Character> digitalTable = getDigitalTable();
        if (radix < 2 || radix >= digitalTable.size() || number < 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder value = new StringBuilder();
        while (number > 0) {
            value.insert(0, digitalTable.get(number % radix));
            number /= radix;
        }
        return value.toString();
    }

    public static List<Character> getDigitalTable() {
        ArrayList<Character> digits = new ArrayList<>();
        for (char c = '0'; c <= '9'; c++) {
            digits.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            digits.add(c);
        }
        return digits;
    }
}
