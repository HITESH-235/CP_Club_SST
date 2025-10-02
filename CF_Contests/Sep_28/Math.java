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
// the key idea is to use the prime factorisation of n; hence checking powers of prime number in it
// for e.g. 140 = 2^2 * 5^1 * 7^1 hence if we had (2^2 * 5^2 * 7^2) we can use sqrt operation
// hence we need to first multiply it with (5^1 * 7^1) = 35; hence use mult_x operation

// in order to minimise these moves we should use mult_x once* only; as mult_x increases n
// for the rest; the perfect square can be rooted log2(a) no. of times to minimise itself
// why log2(a)? because the power(a) of all prime factors is a power of 2 itself if perfect square

// hence we create a loop to get max_power of any prime factor in the prime factorisation of n
// we keep a flag off for checking if we have to use a move for mult_x or not
// if any other power of any prime factor is less than max; we turn the flag on
// also keep dividing n with all these prime factors (as done to get prime factorisation)
// keep a res_1 var to store product of all unique prime factors we can find

// after loop ends; check if n != 1; because there could be another prime remaining
// if n is stil != 1; turn flag on again as we will have to use mult_x anyway

// check for nearest power of 2 equal or greater than max_power(count of power of a prime factor)
// if max_power is not a power of 2; we again turn flag on as we have to use mult_x to do so
// and then we use sqrt functions till this max_power becomes 1; hence costing log2(a) moves

// add this log2(a) to res_2 (res_2 is the 2nd num we return)
// also do res_2 += 1 if flag is on(hence use mult_x once) else dont
// return res_1 + " " + res_2; as we see; that res_1 is automatically the smallest possible number;
// -after we perform res_2 = log2(a) + (1 or 0) no. of operations in it

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
        // max_Power gets the max power of any prime num in factorisation
        int max_Power = 0;
        // res_1 stores the unique prime numbers from prime fact. of n
        int res_1 = 1;
        // flag for deciding if we have to use mult_x or not
        int flag = 0;

        for (int i=2; i*i<=n; i++) {
            if (n%i == 0) {
                // keeps count of power of current prime number
                int curr_Power = 0;
                res_1 *= i; // multiplying with unique prime only
                while (n%i == 0) {
                    curr_Power++;
                    n /= i;
                }
                // if we have to update max_power with curr; 
                // this means we have to use mult_x to get other prime factors get equal power
                if (max_Power != 0 && curr_Power!=max_Power) {flag = 1;}
                max_Power = (curr_Power>max_Power)?curr_Power:max_Power;
            }
        }
        if (n != 1) { // if n!=1 means it is prime right now
            res_1 *= n;
            flag = 1; // since we use mult_x to make this prime num get max_power as well
        }

        // case to check if n is only a product of prime numbers; 0 moves required
        if (max_Power <= 1) {
            System.out.println(res_1+" "+"0");
            sc.close();
            return;
        }
        int i=0, res_2;
        // getting no. of times we have to use sqrt (log2(a) = i),(=> a = 2^i)
        while (1<<i < max_Power) { i++; }
        // if max_power is not power of 2, then also we have to use mult_x
        if (1<<i != max_Power) { flag = 1; }
        
        res_2 = i + flag;
        System.out.println(res_1+" "+res_2);
        sc.close();
    }
}

// e.g. inputs:
// 20 (=> 10 2)
// 5184 (=> 6 4)