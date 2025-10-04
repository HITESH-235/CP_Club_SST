package CP_Club_SST.Sep_18.CodeForces;
import java.util.*;
public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), kth_element = 0, res = 0;

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (i == k-1) { kth_element = arr[i]; }
        }
        for (int e: arr) { if (e>0 && e>=kth_element) { res += 1; } }

        System.out.println(res);
        sc.close();
    }
}
