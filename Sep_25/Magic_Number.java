package CP_Club_SST.Sep_25;

// given a number recursively add its digits; if 1 is reached; return 1; else 0

import java.util.Scanner;

public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(magicNumber(n));
        sc.close();
    }


public static int magicNumber(int n) {
    if (n<10) { return n==1? 1 : 0; }
    int sum = 0;
    while (n!=0) {
        sum += n%10;
        n /= 10;
    }
    return magicNumber(sum);
}
}
// 83593 => 28 => 10 => 1
// 10000 => 1