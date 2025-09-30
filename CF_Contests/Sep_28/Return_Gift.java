// Return Gift!
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/C


// QUESTION EXPLAINED:
// Given a string of only 1s & 0s; named (s); we have to convert it into (t) string
// (t) here is another string formed by performing operations on (s) such that;
// traversing through the string (t); (t[i] != s[i]) for each index of t

// we have been given two operations that we can perform any number of times
// a. swapping any two indices value from s: this operation is free of cost
// b. removing any index value from s; this costs 1*

// it is not necessary that t is of same length as of s; t can be shorter
// return the minimum cost made to make t out of given string s


// SOLUTION EXPLAINED:
// as swapping operation is free; we should maximise it usage to swap 0s with 1s
// thus keeping count of 0s (c0) and 1s (c1) is important to know
// if c0 == c1; we can directly swap every index; hence total cost = 0

// for other cases; we simply have to remove all other indices' value from breakpoint
// breakpoint is simply the first index where we are unable to swap 0s and 1s anymore;
// because c0 or c1 got exhausted of swapping

// to formulate code for this "other case" part; first start iterating over s (len=n);
// if s[i] is '1' then we have to swap it with the next 0; hence decrease c0
// similarly decrease c1 when s[i] is '0' (as we swap it with 1)
// when we completely exhaust atleast one of c1 or c0; the next index becomes breakpoint
// all next indices from breakpoint now need to be removed; costing (n-breakpoint)*
// hence res = n-breakpoint
   
 
package CP_Club_SST.CF_Contests.Sep_28;

import java.util.*;

public class Return_Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        for (int u=0; u<cases; u++) {
            
            String s = sc.nextLine();
            int n = s.length();

            int c0 = 0; // count of 0s in string
            int c1 = 0; // count of 1s in string
            for (int i=0; i<n; i++) {
                if (s.charAt(i)=='0') { c0++; }
                else { c1++; }
            }
            if (c0 == c1) { // t formed only by swapping
                System.out.println(0);
                continue;
            }

            int breakpoint = n;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)=='1') { c0--; }
                else { c1--; }

                if (c0<0 || c1<0) {
                    breakpoint = i;
                    break;
                }
            }
            System.out.println(n-breakpoint);
        }
        sc.close();
    }
}


// e.g. input:
// 4    (cases)

// 0            (= 1) (t = "")
// 011          (= 1) (t = "10")
// 0101110001   (= 0) (t = "1010001110")*
// 111100       (= 4) (t = "00")*