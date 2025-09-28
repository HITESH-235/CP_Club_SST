// Black and white stripe
// CODEFORCES link: https://codeforces.com/problemset/problem/1690/D

package CP_Club_SST.Sep_04.CodeForces;

// here we have give a string of Black and White letters (B & W); we need to tell a window which has all Bs in it
// we can flip the Ws inside that window to make it whole black
// we need to return the minimum flips to be done to make such a window anywhere in the strin

// we make a prefix sum of white letters; hence we can know number of Ws in a window
// our answer would be the min whites in a span of k letters of our string
// hence traverse in the string from i=k to end; and calculate no. of whites in a window from (i-k to i)
// mind the exclusion inclusion of indexes in java

import java.util.*;

public class Black_n_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int u=0; u<cases; u++) {
            int n = sc.nextInt(), k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[] prefix_whites = new int[n+1];
            for (int i=0; i<n; i++) {
                if (s.charAt(i) == 'W') {
                    prefix_whites[i+1] = prefix_whites[i] + 1;
                }
                else {
                    prefix_whites[i+1] = prefix_whites[i];
                }
            }
            if (n==k) {System.out.println(prefix_whites[n]);}
            else {
                int flips = Integer.MAX_VALUE;
                for (int i=k-1; i<n; i++) {
                    flips = Math.min(prefix_whites[i+1]-prefix_whites[i-k+1], flips);
                }
                System.out.println(flips);
            }
        }
        sc.close();
    }
}

// PYTHON CODE:
// def helper(n,k,stripe):
//     prefix_whites = [0]
//     for i in range(1,n+1):
//         if stripe[i-1] == "W":
//             prefix_whites.append(prefix_whites[i-1]+1)
//         else:
//             prefix_whites.append(prefix_whites[i-1])
//     l = 1
//     r = k
//     flips = float('inf')
//     if n == k:
//         return prefix_whites[-1]
//     while r<n+1:
//         flips = min(flips, prefix_whites[r]-prefix_whites[l-1])
//         l += 1
//         r += 1
//     return flips

// cases = int(input())
// for i in range(cases):
//     s = input().split()
//     lst = list(map(int,s))
//     n = lst[0]
//     k = lst[1]
//     stripe = input()
//     print(helper(n,k, stripe))