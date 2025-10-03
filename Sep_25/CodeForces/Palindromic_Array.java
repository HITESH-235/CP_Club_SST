// Palindromic Array: Return YES if given arr is Palindromic else NO
// CODEFORCES link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/R

package CP_Club_SST.Sep_25.CodeForces;
import java.util.*;
public class Palindromic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindromic(arr,0,n-1));
        sc.close();
    }

static String isPalindromic(int[] arr, int left, int right) {
    if (left >= right) {return "YES";}
    if (arr[left] != arr[right]) {return "NO";}
    return isPalindromic(arr, left+1, right-1);
}
}