// XOR Equation
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/G


// QUESTION EXPLAINED:
// Given two numbers; one representing sum and other xor between two arbitrary nums a and b
// there could be none or multiple possible ordered pairs of (a,b) possible for given sum and xor
// return the count of every possible values for a and b (>0, <10^12); hence use long*
// otherwise return 0


// SOLUTION EXPLAINED:
// the key formula that we should be using is (A+B) = (A^B) + 2(A & B)
// hence (A & B) = (sum - xor)/2; it is clear to decide cases which have count = 0 as answer
// if (sum-xor) is not even; or sum<xor; then the value of (A & B) is not a +ve integer

// later; we get count of set bits in given xor;
// because xor has set bits only where a and b were different
// e.g. if a = 111 and b = 010; then xor = 101; (think in reverse)
// as these bits are only where a and b differ; other bits are fixed as we have a fixed sum
// calculate all possible combinations for (a,b) that we can get changing 0s and 1s at xor's set bit locations

// that would be 2**(no of set bits in xor); that's not all! as just doing this does not get 2 for input 3 3
// the thing is that the location/presence of other same bits in a and b change our approach
// hence create a mask that has set bits wherever a and b are equal; that is (a&b)
// and from formula; a&b = (sum - xor)/2

// safety check: if (a&b) & (xor) is 0; then we are going correct (if not return 0 as false case)
// then if (a&b) is 0; then we do not have 2**s possibilities; it will lose 2 counts (hence 2**s-2)
// but if (a&b) != 0; then we can take all 2**s possibilites (s = set bits in xor)


package CP_Club_SST.CF_Contests.Sep_28;

import java.util.*;
public class XOR_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        long xor = sc.nextLong();
        System.out.println(helper(sum,xor));
        sc.close();
    }

static long helper(long sum, long xor) {
    if ((sum-xor)%2!=0 || sum<xor) { // then a&b is not +ve integer
        return 0;
    }

    long setBitsXor = 0;
    long dup = xor;
    while (dup != 0) {
        setBitsXor++;
        dup &= (dup-1);
    }

    long And = (sum-xor)/2;
    if ((xor&And) != 0) {
        return 0;
    }

    long res = 1<<setBitsXor;
    if (And == 0) {
        return res-2;
    }

    return res;
}
}

// 9 5
// 4
// 3 3
// 2
// 5 2
// 0