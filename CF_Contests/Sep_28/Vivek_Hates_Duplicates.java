// Vivek Hates Duplicates
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/A


// QUESTION EXPLAINED:
// given a list of numbers (maybe containing duplicates); 
// we can perform operation by removing any two nums from indices i and j (i != j)*
// hence if we have [1,9,1,9,9] we can remove such pair of nums; say two times
// then we will be left with just 1 element in lst;
// this count after removal should be max and list should only be remaining with unique nums, without duplicates
// return the count of nums remaining
// e.g. [2,2,2,3,3,3] becomes [2,3] hence res is 2


// SOLUTION EXPLAINED:
// calculate count of unique nums (uniques) and total (n already)
// then remaining nums' count (removed) = (n - uniques)
// we can remove these remaining nums in pairs to obtain a list only of unique nums

// there are two cases: (removed is even) : (removed is odd);
// if even; we can form pairs only from remaining nums; and leftover list count (uniques) is res
// if odd; we can form pairs from (removed-1) nums; and 1 of them will have to pair itself from remaining list
// hence in odd case; we can have only (uniques-1) nums in lst; as one of them left for making pair

// return (uniques) if (removed) is even; else return (uniques-1) 


package CP_Club_SST.CF_Contests.Sep_28;

import java.util.*;

public class Vivek_Hates_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            Set<Integer> items = new HashSet<>();

            for (int i=0; i<n; i++) {
                int temp = sc.nextInt();
                nums[i] = temp;
                items.add(temp);
            }

            int uniques = items.size();
            int removed = n - uniques;

            if ((removed&1)==0) { System.out.println(uniques); }
            else { System.out.println(uniques-1); }
        }
        sc.close();
    }
}


// e.g. input
// 5
// 6
// 2 2 2 3 3 3 (= 2)
// 5
// 9 1 9 9 1 (= 1)
// 4
// 15 16 16 15 (= 2)
// 4
// 10 100 1000 1000 (= 4)
// 9
// 1 1 2 2 2 3 3 3 3 (= 3) *(1,2),(2,3),(3,3) *remaining = [1,2,3]