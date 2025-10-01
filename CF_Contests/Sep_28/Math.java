// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/F

// QUESTION EXPLAINED:
// given a number n; we have to make it minimum in least amount of moves possible
// we can perform two operations; any number of times; costing 1 move each
// a. mul_x(n): returns n * x; x is any +ve integer
// b. sqrt: return square-root of n; n must be a perfect square

// return two numbers; first is the updated n value; other is the number of moves
// e.g. for n=20; we use mul_5, n(20) => 100; then sqrt(n) => 10; total 2 moves
// hence we return "10 2" for n=20

// SOLUTION EXPLAINED:
// -----Left for later----

package CP_Club_SST.CF_Contests.Sep_28;

import java.util.*;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1) {
            System.out.println("1 0");
            sc.close();
            return;
        }
        int max_Power = 0;
        int res_1 = 1;
        Boolean flag = true;

        for (int i=2; i*i<=n; i++) {
            if (n%i == 0) {
                int curr_Power = 0;
                res_1 *= i;
                while (n%i == 0) {
                    curr_Power++;
                    n /= i;
                }
                if (max_Power != 0 && curr_Power!=max_Power) {flag = false;}
                max_Power = (curr_Power>max_Power)?curr_Power:max_Power;
            }
        }
        if (n != 1) {
            res_1 *= n;
            flag = false;
        }
        if (max_Power == 1) {
            System.out.println(res_1+" "+"0");
            sc.close();
            return;
        }
        int i=0, res_2;
        while (1<<i < max_Power) { i++; }
        res_2 = i;
        if (1<<i != max_Power) { flag = false; }

        if (!flag) {
            res_2 += 1;
        }
        System.out.println(res_1+" "+res_2);
        sc.close();
    }
}

// e.g. inputs:
// 20 (=> 10 2)
// 5184 (=> 6 4)