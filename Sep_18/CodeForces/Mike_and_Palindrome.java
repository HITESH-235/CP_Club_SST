// Return YES if it is able to form a palindrome using 1 move (change); else NO; e.g. abccaa- "YES"; abcbaa-"NO"
// CODEFORCES link: https://codeforces.com/problemset/problem/798/A

// Odd length strings which are already palindrome are still palindrome if we change (since we change the mid letter)
// Even length strings that are palindrome are not anymore; after changing a pair
// e.g. acca - "NO"; abcba - "YES";

package CP_Club_SST.Sep_18.CodeForces;
import java.util.*;

public class Mike_and_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        System.out.println(isPalindrome(s, 0, n-1, true));
        sc.close();
    }

static String isPalindrome(String s, int l, int r, boolean flag) {
    if (l >= r) {
        if (r%2 == 0) { return "YES"; } 
        else { return "NO"; } // on even lengths; using our move results in NO
    }

    if (s.charAt(l) != s.charAt(r)) {
        if (flag) { flag = false; } // using one available move
        else { return "NO"; }
    }
    return isPalindrome(s, l+1, r-1, flag);
}
}