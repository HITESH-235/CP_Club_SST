// And then there were K
// CODEFORCES link: https://codeforces.com/problemset/problem/1527/A
// given a number n
// find the largest value of k(<=n) such that  n & (n-1) & (n-2)...(k+1) & k = 0

// e.g. 1010 = 10
// ans is (1000) -1 = 8- 1 = 7
// because 1010(10) ^ 1001(9) ^ 1000(8) = 1000(8), this happens for nearest power of 2
// as power of two contains all zeroes except leftmost set bit
// hence doing this xor result in that power of 2 as result
// now, 1000(8) ^ 0111 (8-1) = 0000 always
// that is why we just move just 1 below this power of 2

package CP_Club_SST.Sep_11.CodeForces;

import java.util.*;

public class Then_there_were_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();
            int i = 0;
            while ((1<<i) <= n) {
                i++;
            }
            System.out.println((1<<(i-1))-1);
        }
        sc.close();
    }
}

// cases = int(input())
// for i in range(cases):
//     n = int(input())

//     i = 0
//     while (1<<i) <= n:
//         i += 1

//     print((1<<(i-1)) - 1)