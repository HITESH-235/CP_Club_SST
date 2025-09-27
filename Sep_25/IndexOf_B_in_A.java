package CP_Club_SST.Sep_25;

// Given an array A return the first index where B appears in A, (i) from front (first occurence); (ii) from back (last occurence)

import java.util.*;
public class IndexOf_B_in_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.print("\n");
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }
        // System.out.print("\n");
        int B = sc.nextInt();
        System.out.println("Index of B first occurence: " + IndexOfB_Front(A,B));
        System.out.println("Index of B last occurence: " + IndexOfB_Back(A,B));
        sc.close();
    }


public static int IndexOfB_Front(ArrayList<Integer> A, int B) {
    return helper(A,B,0);
}
static int helper(ArrayList<Integer> A, int B, int i) {
    if (i==A.size()) {return -1;}
    if (A.get(i) == B) {return i;}
    return helper(A,B,i+1);
}


public static int IndexOfB_Back(ArrayList<Integer> A, int B) {
    return helper_2(A,B,A.size()-1);
}
static int helper_2(ArrayList<Integer> A, int B, int i) {
    if (i==-1) {return -1;}
    if (A.get(i) == B) {return i;}
    return helper_2(A,B,i-1);
}
}
