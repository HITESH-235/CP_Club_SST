// XORwice
// CODEFORCES link: https://codeforces.com/problemset/problem/1421/A

// Here we are given two numbers a and b, we need to compute the minimum value of expression: (a^x) + (b^x)
// re-evaluating this expression; we get (a+b)^x; so x must be having more of the same set bits in both a and b
// hence x needs to have same set bits of (a&b) (since "&" takes out common set bits in a and b)
// thus for x = (a&b); (a+b)^(a&b) will have minimum value

// (a+b)^(a&b) = a^(a&b) + b^(a&b) = a^b (explained further:)
// a^(a&b) has only those bits unset where; both* a and b were set; hence, a^(a&b) = a & (~b)
// a & (~b), removes set bits from a where b was also set

// similarly b^(a&b) = b & (~a), removes set bits from b where a was also set

// now minimum expression (a+b)^(a&b) = a^(a&b) + b^(a&b) = a&(~b) + b&(~a) = {(a union b) - (a intersec b)}
// which is nothing but a^b 

package CP_Club_SST.Sep_11.CodeForces;

import java.util.*;

public class XORwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a^b);
        }
        sc.close();
    }
}