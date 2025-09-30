package CP_Club_SST.CF_Contests.Sep_28;

// given a list of only prefix sums of size k; where it is actually formed from another parent list of size n
// this parent list is given to of increasing nature; a0 <= a1 <= a2..... <= a(n)

// but there could have been prefix sum lst for all n items; but we are given it for the last k items only
// but the testcases also have prefix sum lst where it is impossible to have (n-k) more items

// e.g. if prefix sums = [2,3,4], given with for n=3; k=3; then it cannot be true 
// (think why 2 cannot be the first element of this k-sized prefix sum lst)
// because if 2 is first item; 2 is first element; hence next item has to be 1* for prefix_sum's 2nd item to be 3*
// this is not possible as parent nums lst is given to of increasing nature

// similarly; for n=7; k=4; prefix_sums = [6,12,19,26] is valid as there can exist 3 nums before 6 as prefix sum
// e.g. for above original nums can be [0,0,0,6,6,7,7];

// return "YES" if this can be formed else "NO"

// My approach:
// clearly the difference between the prefix sum elements should be increasing else nums is not increasing;
// other than that the least difference between those elements gives us way to find answer

// if this least difference times (n-k+1) is greater than prefix sum's first element; then its correct
// e.g. if we have minDiff = 2; n = 5; k = 3; p_sum[0] = 7; then;
// we cannot find a set of 3* numbers to have increasing nature and form a p_sum of 7 until 3rd* element  

// say minDiff = 3; n = 5; k = 3; p_sum[0] = 2; then we can easily form 0,0,2.. as those 3 elements
// (the reason we take n-k+1 & not n-k is because we take accout for the element at p_sum[0] in nums)

import java.util.Scanner;

public class Prefix_Sum_Addicts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int u=0; u<cases; u++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] prefixSums = new int[k];

            for (int w=0; w<k; w++) {
                prefixSums[w] = sc.nextInt();
            }
            System.out.println(helper(n,k,prefixSums));
        }
        sc.close();
    }

static String helper(int n, int k, int[] prefixSums) {
    long minDiff = Integer.MAX_VALUE;

    for (int i=k-1; i>0; i--) {
        if (minDiff < prefixSums[i] - prefixSums[i-1]) {
            return "NO";
        }
        minDiff = prefixSums[i] - prefixSums[i-1];
    }

    if (prefixSums[0] <= (n-k+1)*minDiff) {
        return "YES";
    }
    return "NO";
}
}
// 4
// 5 5
// 1 2 3 4 5
// 7 4
// -6 -5 -3 0
// 3 3
// 2 3 4
// 3 2
// 3 4
// OutputCopy
// Yes
// Yes
// No
// No