// Subtract or Divide
// CODEFORCES link: https://codeforces.com/problemset/problem/1451/A

// given a number n; we can either divide it by its proper divisor; or subtract 1
// goal is to convert n -> 1 in minimum steps (each operation is +1 step)
// hence for min steps we should divide n by its largest proper divisor; which is n/2
// but that is only when n is even; hence if n is odd; subtract 1 to make it even

// even shorter way would be to analyse cases;
// n=1:0 ; n=2:1; n=3:2; where latter nums are min steps
// for any other case; say 17; we first subtract 1; make it 16; make it 2 (dividing it by 16/2); thus 3 steps
// for any odd number greater than 3; 3 steps are required only
// else for odd nums; 2 steps are required only

package CP_Club_SST.Sep_11.CodeForces;

import java.util.*;

public class Subtract_or_Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();

            if (n == 1||n==2||n==3) {System.out.println(n-1);}

            else {
                if ((n&1)==0) {System.out.println(2);}
                else {System.out.println(3);}
            }
        }
        sc.close();
    }
}