// Base Conversion: Given n (+ve int); convert to binary
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/E

package CP_Club_SST.Sep_25.CodeForces;
import java.util.*;

public class Base_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();

            // normal strings are not mutable; would have remained empty
            System.out.println(helper(n,new StringBuilder()));
        }
        sc.close();
    }

static StringBuilder helper(int n, StringBuilder res) {
    if (n==0) {
        return res;
    }
    helper(n/2,res);

    res.append(n%2);
    return res;
}
}