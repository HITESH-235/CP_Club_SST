package CP_Club_SST.Sep_25;

// return 1 if given string is palindrome; else 0

import java.util.*;

public class Palindrome_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindromeRecursive(s));
        sc.close();
    }

    public static int palindromeRecursive(String s) {
        int left = 0, right = s.length()-1;
        if (helper(s,left,right)) {return 1;}
        else {return 0;}
    }
    static boolean helper(String s, int left, int right) {
        if (left>=right) {return true;}
        if (s.charAt(left) != s.charAt(right)) {return false;}
        return helper(s,left+1,right-1);
    }
}
