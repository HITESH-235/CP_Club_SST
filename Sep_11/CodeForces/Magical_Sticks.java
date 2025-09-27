// Magical Sticks
// CODEFORCES link: https://codeforces.com/problemset/problem/1371/A

// Here we are given n sticks of length 1,2,3,4..n, We need to pair up these sticks;
// such that there can be maximum sticks of (any) length

// hence suppose n = 6; then pairs of any length (their sum):
// (1,2),(3,4),(5,6) = 3 pairs = 6 // 2
// suppose n = 7 (an odd num); then also we can make only 3 (max) pairs = 7 // 2 = 3
// hence in any case just return (n+1)//2

package CP_Club_SST.Sep_11.CodeForces;

import java.util.*;

public class Magical_Sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            System.out.println(((x+1)/2));
        }
        sc.close();
    }
}