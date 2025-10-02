// Printing Digits Of a Number
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/D

package CP_Club_SST.Sep_25.CodeForces;

import java.util.*;

public class Printing_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();
            System.out.println(helper(n));
        }
        sc.close();
    }

static String helper(int n) {
    if (n/10==0) {return String.valueOf(n);}
    String last = String.valueOf(n%10);
    return helper(n/10) + " " + last;
}
}