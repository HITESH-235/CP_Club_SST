// Maxim and Biology: ACTG (genome substring)
// CODEFORCES link: https://codeforces.com/problemset/problem/1151/A

package CP_Club_SST.Sep_04.CodeForces;

// given a string of length n; return the min shifts of letters to do so that "ACTG" is present in the string
// e.g. in ZTCG if we shift Z to A; we shift it by 1 place; and we get "ACTG" hence total and min steps taken =1
// similarly for AZTG; we move Z to C; hence shifting by 3 places; min steps is 3
// there can be multiple shifiting to do; add them all and find min possible

// visit every index and lookup for next 3 letters (or previous 3 letters) and find total steps to form ACTG
// if found check if its less than min until now
// hence we can make a function to find steps taken at each letter to make task easier

import java.util.*;

public class Maxim_Biology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int minDiff = Integer.MAX_VALUE;
        for (int i=3; i<n; i++) {
            int temp = minDiff(s.charAt(i-3),'A') + minDiff(s.charAt(i-2),'C') + minDiff(s.charAt(i-1),'T') + minDiff(s.charAt(i),'G');
            minDiff = Math.min(minDiff,temp);
        }
        System.out.println(minDiff);;
        sc.close();
    }
    static int minDiff(char n, char ch) {
        int diff = Math.abs((int)(n) - (int)(ch));
        return Math.min(diff,26-diff);
    }
}


// PYTHON CODE:
// n = int(input())
// s = str(input())

// min_operations = float('inf')
// def min_steps(x,y):
//     diff = abs(ord(x)-ord(y))
//     return min(diff, 26-diff) # since have to check in circular alphabets

// i = 3
// while i<n:
//     curr_operations = min_steps(s[i-3],'A') + min_steps(s[i-2],'C') + min_steps(s[i-1],'T') + min_steps(s[i],'G')
//     min_operations = min(min_operations, curr_operations)
//     i += 1
// print(min_operations)