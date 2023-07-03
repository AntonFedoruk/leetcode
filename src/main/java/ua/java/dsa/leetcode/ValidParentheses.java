package ua.java.dsa.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input1T = "()";
        String input2T = "()[]{}";
        String input3F = "(]";
        String input4F = "([)]";
        String input5T = "{[]}";
        String input6T = "(([]){})";

        System.out.println(isValid3(input1T));
        System.out.println(isValid3(input2T));
        System.out.println(isValid3(input3F));
        System.out.println(isValid3(input4F));
        System.out.println(isValid3(input5T));
        System.out.println(isValid3(input6T));
    }

    public static boolean isValid(String s) {
        int circleBracketCount = 0;
        int squareBracketCount = 0;
        int figureBracketCount = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> {
                    circleBracketCount++;
                    String substring = s.substring(i + 1);
                    int end = substring.indexOf(')');
                    if (end == -1) {

                        return false;
                    }
                    if (end != 0) {
                        String innerStr = s.substring(i + 1, 1 + end);
                        if (isValid(innerStr)) {
                            i += end;
                        } else {
                            return false;
                        }
                    }
                }
                case ')' -> {
                    if (circleBracketCount-- < 0) {
                        return false;
                    }
                }
                case '[' -> {
                    squareBracketCount++;
                    String substring = s.substring(i + 1);
                    int end = substring.indexOf(']');
                    if (end == -1) {
                        return false;
                    }
                    if (end != 0) {
                        String innerStr = s.substring(i + 1, 1 + end);
                        if (isValid(innerStr)) {
                            i += end;
                        } else return false;
                    }
                }
                case ']' -> {
                    if (squareBracketCount-- < 0) {
                        return false;
                    }
                }
                case '{' -> {
                    figureBracketCount++;
                    String substring = s.substring(i + 1);
                    int end = substring.indexOf('}');
                    if (end == -1) {
                        return false;
                    }
                    if (end != 0) {
                        String innerStr = s.substring(i + 1, 1 + end);
                        if (isValid(innerStr)) {
                            i += end;
                        } else return false;
                    }
                }
                case '}' -> {
                    if (figureBracketCount-- < 0) return false;
                }
            }
        }
        return !(circleBracketCount != 0 | squareBracketCount != 0 | figureBracketCount != 0);
    }

    public static boolean isValid2(String s) {
        int circleBracketCount = 0;
        int squareBracketCount = 0;
        int figureBracketCount = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> {
                    circleBracketCount++;
                    int closingBracketIndex = 0;
                    int startPoint = i + 1;
                    for (int j = 0; j < circleBracketCount; j++) {
                        String innerStr = s.substring(startPoint);
                        closingBracketIndex = innerStr.indexOf(')');
//                        if (s.substring(startPoint,closingBracketIndex).contains("(")) {
//
//                            circleBracketCount++;
//                        }
                        if (closingBracketIndex != -1) {
                            startPoint = closingBracketIndex;
                        } else {
                            return false;
                        }
                    }
                    if (closingBracketIndex != 0) {
                        String innerStr = s.substring(i + 1, 1 + closingBracketIndex);
                        if (isValid(innerStr)) {
                            i += closingBracketIndex;
                        } else {
                            return false;
                        }
                    }
                }
                case ')' -> {
                    if (circleBracketCount-- < 0) {
                        return false;
                    }
                }
                case '[' -> {
                    squareBracketCount++;
                    int bracketIndex = 0;
                    int startPoint = i + 1;
                    for (int j = 0; j < circleBracketCount; j++) {
                        bracketIndex = s.substring(startPoint).indexOf(']');
                        if (bracketIndex != -1) {
                            startPoint = bracketIndex;
                        } else {
                            return false;
                        }
                    }
                    if (bracketIndex != 0) {
                        String innerStr = s.substring(i + 1, 1 + bracketIndex);
                        if (isValid(innerStr)) {
                            i += bracketIndex;
                        } else {
                            return false;
                        }
                    }
                }
                case ']' -> {
                    if (squareBracketCount-- < 0) {
                        return false;
                    }
                }
                case '{' -> {
                    figureBracketCount++;
                    int bracketIndex = 0;
                    int startPoint = i + 1;
                    for (int j = 0; j < circleBracketCount; j++) {
                        bracketIndex = s.substring(startPoint).indexOf('}');
                        if (bracketIndex != -1) {
                            startPoint = bracketIndex;
                        } else {
                            return false;
                        }
                    }
                    if (bracketIndex != 0) {
                        String innerStr = s.substring(i + 1, 1 + bracketIndex);
                        if (isValid(innerStr)) {
                            i += bracketIndex;
                        } else {
                            return false;
                        }
                    }
                }
                case '}' -> {
                    if (figureBracketCount-- < 0) return false;
                }
            }
        }
        return !(circleBracketCount != 0 | squareBracketCount != 0 | figureBracketCount != 0);
    }

    public static boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) return false;
                if (character == ')' && stack.peek()=='(') {
                    stack.pop();
                } else if (character == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (character == ']' && stack.peek() == '[') {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}