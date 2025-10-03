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
        for (int i=0; i<n; i++) {
            int e = sc.nextInt();
            arr[i] = e;
        }
        printEvenIndices(arr,0);
        sc.close();
    }

static void printEvenIndices(int[] arr, int i) {
    if (i==arr.length-1 || i==arr.length-2) {
        System.out.print(arr[i]);
        return;
    }
    printEvenIndices(arr, i+2);
    
    System.out.print(" ");
    System.out.print(arr[i]);
    return;
}
}