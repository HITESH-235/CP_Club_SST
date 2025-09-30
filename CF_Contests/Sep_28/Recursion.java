// Recursion: Gold Nuggets
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/E


// QUESTION EXPLAINED:
// we are given two numbers n and m; such that n is a large gold bar;
// we can split up this gold in two pieces: 2n/3 and n/3 each
// and then we can split up these pieces further through the same ratio
// the goal is to find if we can find a gold nugget of size m in these pieces
// if found return "yes" else 'no'


// SOLUTION EXPLAINED:
// easiest case is when n<m; we can never find a nugget of bigger size; NO

// another easy case is when n=m; then we can directly say YES
// but we have to put this into the function to perform recursion (should return T/F)
// if equal return true; otherwise check if its partitions are equal to m

// if both 2n/3 and n/3 are not equal to m; call this function upon one of the piece
// say helper(2n/3,m) returned false; then only, check further for helper(n/3,m)
// keep a variable to store what helper(2n/3,m) returns then;
// if it is false, update var with helper(n/3,m);
// return this var as T/F


package CP_Club_SST.CF_Contests.Sep_28;
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int u=0; u<cases; u++) {
            int n = sc.nextInt(), m = sc.nextInt();

            if (n<m) {
                System.out.println("NO");
                continue;
            }

            Boolean found = helper(n,m);

            if (found) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
        sc.close();
    }

static Boolean helper(int n, int m) {
    if (n==m) {return true;}
    if (n%3 != 0) {return false;}

    int temp = n/3;
    if (temp==m) {return true;}
    if (temp*2 == m) {return true;}

    Boolean found = helper(temp*2,m);
    if (!found) { found = helper(temp,m); }

    return found;
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