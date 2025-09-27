// Minimal Square
// CODEFORCES link: https://codeforces.com/problemset/problem/1360/A

// given two rectangles each of dimension a x b;
// we need to find area of smallest square than can fit both
// smaller and greater are the side lengths of given rectangle
// hence if (smaller x 2) > greater; then (smaller x 2) is the side length result square
// else we have to give greater as result side length if (smaller x 2) < greater

package CP_Club_SST.Sep_11.CodeForces;

import java.util.*;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            int smaller_x2 = Math.min(a,b)<<1, greater = Math.max(a,b);

            if (smaller_x2 <= greater) {
                System.out.println(greater*greater);
            }
            else {
                System.out.println(smaller_x2*smaller_x2);
            }
        }
        sc.close();
    } 
}

// PYTHON CODE:
// cases = int(input())

// for i in range(cases):
//     a, b = map(int, input().split())
//     smaller_x2 = min(a,b)<<1
//     greater = max(a,b)
//     if smaller_x2 <= greater: #then we cannot cover greater with smaller_x2
//         print(greater*greater) # hence give greater as the side length 
//     else:
//         print(smaller_x2*smaller_x2) # else smaller as side length is better