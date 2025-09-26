package CP_Club_SST.Sep_25;

// print reverse of a string using recursion

import java.util.*;

public class Reverse_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseRecursive(s));
        System.out.println(reverseRecursive_2(s));
        sc.close();
    }

public static String reverseRecursive(String s) {
    int n = s.length()-1;
    return helper(s,n);
}
static String helper(String s, int n) {
    if (n==-1) {return "";}
    return s.charAt(n) + helper(s,n-1);
}

public static String reverseRecursive_2(String s) {
    int n = s.length()-1;
    return helper_2(s,n,new StringBuilder());
}
static String helper_2(String s, int n, StringBuilder res) {
    if (n==-1) {return String.valueOf(res);}
    res.append(s.charAt(n));
    return helper_2(s,n-1,res);
}
}
