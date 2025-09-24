package CP_Club_SST.Sep_18;

// import java.util.*;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s = "abababab";
        System.out.println(longestPalindromicSubstring(s));
    }

    public static String longestPalindromicSubstring(String s) {
        String res = "";
        int[] p_odd, p_even;

        for (int i=0; i<s.length(); i++) {
            p_odd = expand(s,i,i); // checking for odd* len palindrome (i is center)
            p_even = expand(s,i,i+1); // # checking for even* len palindrome

            if (p_odd[1]-p_odd[0]+1 > res.length()) { res = s.substring(p_odd[0], p_odd[1]+1); }

            if (p_even[1]-p_even[0]+1 > res.length()) { res = s.substring(p_even[0], p_even[1]+1); }
        }
        return res;
    }

// expands if same to both direction and returns that (palindromic) substring
    public static int[] expand(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return new int[] {left+1,right-1};
    // left and right have moved beyond correct palindrome
    // thus we need to slice from (left+1) --> (right-1)
    }
}