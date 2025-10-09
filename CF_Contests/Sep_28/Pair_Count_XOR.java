// You are given an array of N non-negative integers, A, and a second array of M integers, B. The second array, B, represents a set of bit positions to query (0-indexed).
// For each bit position b in the array B, you must find the total number of unique pairs (i, j) such that 0 <= i < j < N, where the b-th bit of the result of A[i] XOR A[j] is set to 1.
// Return an array (or list) of size M where the k-th element is the count of such pairs for the bit position B[k].

package CP_Club_SST.CF_Contests.Sep_28;
public class Pair_Count_XOR {
    public static void main(String[] args) {
        int[] A = new int[] {1,2,3}; // [1,2,3]
        int[] B = new int[] {0,1}; // [0,1]


        for (int e:func(A,B)) {
            System.out.print(e);
            System.out.print(" ");
        } // 2 2 should be returned
    }

public static int[] func(int[] A, int[] B) {
    int[] res = new int[B.length];

    for (int i=0; i<B.length; i++) {
        int setBits = 0, unsetBits = 0;
        for (int x: A) {
            if (((x>>B[i])&1) == 1) {setBits++;}
            else {unsetBits++;}
        }
        int temp = setBits*unsetBits;
        res[i] = temp;
    }
    return res;
}
}