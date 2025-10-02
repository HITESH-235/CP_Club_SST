// Base Conversion: Given n (+ve int); convert to binary
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/E

package CP_Club_SST.Sep_25.CodeForces;

import java.util.*;

public class Base_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int u=0; u<cases; u++) {
            String res = "";
            int n = sc.nextInt();

            while (n!=0) {
                res += String.valueOf(n%2);
                n /= 2;
            }
            
            for (int i=res.length()-1; i>=0; i--) {
                System.out.print(res.charAt(i));
            }
            System.out.println();
        }
        sc.close();
    }
}