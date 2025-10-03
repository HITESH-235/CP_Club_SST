// Return the largest number present in given array of n size
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/K

package CP_Club_SST.Sep_25.CodeForces;
import java.util.*;
public class Max_Num_in_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        int max = Integer.MIN_VALUE;
        System.out.println(maxOfArr(arr,max, 0));
        sc.close();
    }

static int maxOfArr(int[] arr, int max, int i) {
    if (i == arr.length) {return max;}

    max = java.lang.Math.max(max, arr[i]);
    return maxOfArr(arr, max, i+1);
}
}