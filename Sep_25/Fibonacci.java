package CP_Club_SST.Sep_25;

import java.util.*;

// given an int n, return nth number of fibonacci series

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciIterative(n));
        System.out.println(fibonacciRecursive(n));
        sc.close();
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) {return n;}
        long prev = 0, curr = 1, temp;
        for (int i=0; i<n-1; i++) {
            temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        return curr;
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 1) {return (long)n;}
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}