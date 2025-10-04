// Petya and Strings
// CODEFORCES link: https://codeforces.com/problemset/problem/112/A

// compare two strings lexicographically; return 1 if first is greater than second
// return -1 if first is lesser than second
// if equal return 0; ignore case

package CP_Club_SST.Sep_18.CodeForces;
import java.util.*;
public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        int x, y, max_len = java.lang.Math.max(s1.length(),s2.length());
        for (int i=0; i<max_len; i++) {
            x = (int)s1.charAt(i);
            y = (int)s2.charAt(i);

            if (x!=y) {
                int res = (x>y)? 1:-1;
                System.out.println(res);
                sc.close();
                return;
            }
        }
        System.out.println(0);
        sc.close();
        return;
}
}