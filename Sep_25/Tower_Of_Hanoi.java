package CP_Club_SST.Sep_25;

// Tower Of Hanoi; given no. of disks A; rearrange them by moving between towers 1,2,3
// return a list of lists containing steps of this movement; e.g. [2,1,3] means 2nd disk from top, moved from tower 1 to 3
// e.g. for A = 2; res = [[1, 1, 2], [2, 1, 3], [1, 2, 3]]

import java.util.*;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(HanoiTower(A));
        sc.close();
    }

public static ArrayList<ArrayList<Integer>> HanoiTower(int A) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    helper(res,A,1,2,3);
    return res;
}
static void helper(ArrayList<ArrayList<Integer>> res,int A, int a, int b, int c) {
    if (A == 0) {return;}

    // goes from A (largest) upto 1 (smallest disk)
    helper(res,A-1,a,c,b); // puts up all disks on middle

    ArrayList<Integer> temp = new ArrayList<>();
    temp.add(A);   // disk (to be moved)
    temp.add(a);   // from-tower
    temp.add(c);   // to-tower
    res.add(temp);

    // moves disk from middle to third tower
    helper(res,A-1,b,a,c); 
}
}

// Python Code (to understand better):

// class Solution:
//     # @param A : integer
//     # @return a list of list of integers
//     def towerOfHanoi(self, A):
//         res = []
//         def helper(res,A,a,b,c): # res, disk, from, middle, to-tower
//             if (A==0): return
//             else:
//                 # goes from A (largest) upto 1 (smallest disk)
//                 helper(res,A-1,a,c,b) # puts up all disks on middle

//                 res.append([A,a,c]) # disk, from-tower, to-tower

//                 # moves disk from middle to last tower
//                 helper(res,A-1,b,a,c)
//         helper(res,A,1,2,3)
//         return res