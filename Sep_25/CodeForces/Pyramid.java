package CP_Club_SST.Sep_25.CodeForces;

import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += n-1;
        pyramid(n,0);
        sc.close();
    }

static void pyramid(int n, int count) {
    if (n<=0) {return;}

    pyramid(n-2,count+1);
    // for (int i=0; i<count; i++) {
    //     System.out.print(" ");
    // }
    System.out.print(" ".repeat(count));
    System.out.print("*".repeat(n));
    // for (int i=0; i<n; i++) {
    //     System.out.print("*");
    // }
    System.out.println();
}
}