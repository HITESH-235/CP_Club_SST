// Recursion: Gold Nuggets
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/E

// QUESTION EXPLAINED:
// we are given two numbers n and m; such that n is a large gold bar;
// we can split up this gold in two pieces: 2n/3 and n/3 each
// and then we can split up these pieces further through the same ratio
// the goal is to find if we can find a gold nugget of size m in these pieces
// if found return "yes" else 'no'

package CP_Club_SST.CF_Contests.Sep_28;
import java.util.*;

public class Gold_Nuggets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int u=0; u<cases; u++) {
            int n = sc.nextInt(), m = sc.nextInt();

            Boolean found = helper(n,m);

            if (found) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
        sc.close();
    }

static Boolean helper(int n, int m) {
    if (n==m) {return true;} // nugget found at start
    if (n<m || n%3 != 0) {return false;} // two easy false cases

    int temp = n/3;
    if (temp==m) {return true;} // checking each component
    if (temp<<1 == m) {return true;}

    // if pieces directly not equal
    if (helper(temp<<1,m)) {
        return true; // if helper(2n/3,m) find true
    }
    return helper(temp,m); // else check for helper(n/3,m)
}
}


// 11
// 6 4      (= Y)
// 9 4      (= Y)
// 4 2      (= N)
// 18 27    (= N)
// 27 4     (= Y)
// 27 2     (= Y)
// 27 10    (= N)
// 1 1      (= Y)
// 3 1      (= Y)
// 5 1      (= N)
// 746001 2984004  (= N)