package ua.java.dsa.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbbb"));//1
        System.out.println(lengthOfLongestSubstring2("pwwkew"));//3
        System.out.println(lengthOfLongestSubstring(" "));//1
        System.out.println(lengthOfLongestSubstring(""));//0
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int longestSubstring = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!sb.toString().contains(String.valueOf(s.charAt(i)))) {
                sb.append(s.charAt(i));
                longestSubstring = Math.max(longestSubstring, sb.length());
            } else {
                int shouldBeDelIndex = sb.lastIndexOf(String.valueOf(s.charAt(i)));
                sb.delete(0, shouldBeDelIndex + 1);
                sb.append(s.charAt(i));
            }
        }
        return longestSubstring;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;
        int start = 0;
        int[] position = new int[128];
        for( int cur = 0; cur<s.length(); cur++){
            // start update
            start = Math.max(start,position[s.charAt(cur)]);
            // maxLength update
            maxLength = Math.max(maxLength, cur-start+1);
            position[s.charAt(cur)] = cur +1;
        }
        return maxLength;
    }
}
