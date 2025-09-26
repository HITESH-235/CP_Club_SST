package CP_Club_SST.Sep_25;

import java.util.*;

public class Print_1_to_N{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print1toN(n));
        System.out.println(printNto1(n));
        sc.close();
    }


public static String print1toN(int n) {
    return helper(1,n);
}
static String helper(int i,int n) {
    if (i==n) {return String.valueOf(n);}
    return String.valueOf(i) + " " + helper(i+1,n);
}


public static String printNto1(int n) {
    if (n==1) {return "1";}
    return String.valueOf(n) + " " + printNto1(n-1);
}
}