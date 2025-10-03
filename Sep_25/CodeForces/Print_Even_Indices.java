// Print Even Indices
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/F
// Given N and an array A of N nums. Print the numbers in even indices in a reversed order.

package CP_Club_SST.Sep_25.CodeForces;

import java.util.Scanner;

public class Print_Even_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
    }

static void printEvenIndices(int[n] arr, int i) {
    if (i==n-1 || i==n-2) {
        System.out.println(arr[i]);
        return;
    }
    printEvenIndices(int[n] arr, i+2);
    
    System.out.println(arr[i], " ");
    return;
}
}