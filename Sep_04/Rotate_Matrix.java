// to rotate clockwise: 1.transpose 2.reverse
// to rotate anti-clockwise: 1.reverse 2.transpose
// or use clockwise rotation several times to get to the same anti clockwise rotation

package CP_Club_SST.Sep_04;
import java.util.*;
public class Rotate_Matrix {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,2,3)));
        A.add(new ArrayList<>(Arrays.asList(4,5,6)));
        A.add(new ArrayList<>(Arrays.asList(7,8,9)));

        printMatrix(optimisedRotation(A));
        transpose(A);
        reversal(A);
        printMatrix(A);
    }

public static void transpose(List<List<Integer>> A) {
    for (int i=0; i<A.size(); i++) {
        for (int j=i+1; j<A.size(); j++) {

            int x = A.get(i).get(j);
            int y = A.get(j).get(i);
            A.get(i).set(j,y);
            A.get(j).set(i,x);

            // int temp = A.get(i).get(j);
            // A.get(i).set(j,A.get(j).get(i));
            // A.get(j).set(i, temp);
        }
    }
}

public static void reversal(List<List<Integer>> A) {
    int n = A.size();
    
    for (int i=0; i<n; i++) {
        int left = 0, right = n-1;
        while (left<right) {
            int x = A.get(i).get(left);
            int y = A.get(i).get(right);

            A.get(i).set(left,y);
            A.get(i).set(right,x);
            left++;
            right--;
        }
    }
} 

public static List<List<Integer>> optimisedRotation(List<List<Integer>> A) {
    int n = A.size();
    // creating res with all elements initially 0
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i<n; i++) {
        List<Integer> temp = new ArrayList<>();
        for (int j = 0; j<n; j++) {
            temp.add(0);
        }
        res.add(temp);
    }
    // setting values from A
    for (int i = 0; i<n; i++) {
        for (int j = 0; j<n; j++) {

            res.get(i).set(n-j-1 , A.get(j).get(i));
        }
    }
    return res;
}

public static void printMatrix(List<List<Integer>> A) {
    for (List<Integer> arr: A) {
        for (int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}

// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
// LEETCODE link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

// leetcode answer:
static boolean findRotation(int[][] mat, int[][] target) {
    for (int i=0; i<4; i++) {
        mat = rotate(mat);
        if (isSame(mat, target)) return true;
    }
    return false;
}

public static int[][] rotate(int[][] A) {
    int n = A.length;
    int[][] res = new int[n][n];
    for (int i = 0; i<n; i++) {
        for (int j = 0; j<n; j++) {

            res[i][n-j-1] = A[j][i];
        }
    }
    return res;
}

public static boolean isSame(int[][] A, int[][] target) {
    int n = A.length;
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (A[i][j] != target[i][j]) return false; 
        }
    }
    return true;
}

// public static void printMatrix(int[][] A) {
//     for (int[] arr: A) {
//         for (int e: arr) {
//             System.out.print(e+" ");
//         }
//         System.out.println();
//     }
// }


// Tranpose of Any Matrix (order MxN):
public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> A) {
    int row = A.size(), col = A.get(0).size();

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    for (int i=0; i<col; i++) { res.add(new ArrayList<>()); }

    for (int i=0; i<row; i++) {
        for (int j=0; j<col; j++) { res.get(j).add(A.get(i).get(j)); }
    }
    return res;
}
}