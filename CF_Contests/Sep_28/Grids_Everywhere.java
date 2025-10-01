// Grids Everywhere
// CODEFORCES link: https://codeforces.com/group/GHrcjas6PZ/contest/637731/problem/B


// QUESTION EXPLAINED:
// given a grid of dimensions n*m with numbers representing different colors of cells on grid
// the goal is to paint whole grid with a single color at the end in minimum number of moves
// in one single move, we can select as many cells of same color as we want to change color of;
// along with one constraint that these selected ones should be stranger*
// meaning they cannot share any side with each other; except touching at corner
// we need to return the minimum number of such moves that it takes to paint whole grid to one color
// in a grid with already all cells of same color the moves req is 0


// SOLUTION EXPLAINED:
// find one single set of moves (possibilities) it takes to change color of all cells of one color

// find which colors have all its positions as strangers and which ones not

// *KEY IDEA*:
// for colors with all strange positions; it takes exaclty one* move to flip them to another color
// for colors with any non strange position; it takes exactly two* moves to flip color

// calculate so by storing all colors into a hashmap as keys for color and their req moves as values
// to do this first create loops to traverse through the grid
// look up for cells in all four directions of a cell (as given below)
// if a cell has non strange nature; put up 2* as its value
// else put up 1* as its value if the cell has completely strange positions

// add up all these values in res after traversal over grid ends (through another loop over hashmap)
// return (res) - (max moves found of a color) as our best answer should be minimum; as well as;
// one color should not be flipped as that is selected to be color of whole grid at end


package CP_Club_SST.CF_Contests.Sep_28;

import java.util.*;

public class Grids_Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int u=0; u<cases; u++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            HashMap<Integer,Integer> freqMap = new HashMap<>();
            
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (!freqMap.containsKey(grid[i][j])) {
                        freqMap.put(grid[i][j],1);
                    }
                    if ((i+1)<n && grid[i][j] == grid[i+1][j]) {
                        freqMap.put(grid[i][j],2);
                        continue;
                    }
                    if ((i-1)>=0 && grid[i][j] == grid[i-1][j]) {
                        freqMap.put(grid[i][j],2);
                        continue;
                    }
                    if ((j+1)<m && grid[i][j] == grid[i][j+1]) {
                        freqMap.put(grid[i][j],2);
                        continue;
                    }
                    if ((j-1)>=0 && grid[i][j] == grid[i][j-1]) {
                        freqMap.put(grid[i][j],2);
                        continue;
                    }
                }
            }
            int moves = 0, maxFreq = 0;
            for (int key : freqMap.keySet()) {
                int freq = freqMap.get(key);
                moves += freq;
                maxFreq = (freq > maxFreq) ? freq : maxFreq;
            }
            System.out.println(moves-maxFreq);
        }
        sc.close();
    }
}


// PYTHON CODE:
// def helper():
//     n,m = map(int,input().split())
//     grid = []
//     for i in range(n):
//         grid.append(list(map(int, input().split())))
        
//     if n*m <= 1: return 0

//     freqMap = {}
//     for i in range(n):
//         for j in range(m):
//             if grid[i][j] not in freqMap:
//                 freqMap[grid[i][j]] = 1
//             if i+1<n and grid[i][j] == grid[i+1][j]:
//                 freqMap[grid[i][j]] = 2
//                 continue
//             if i-1>=0 and grid[i][j] == grid[i-1][j]:
//                 freqMap[grid[i][j]] = 2
//                 continue
//             if j+1<m and grid[i][j] == grid[i][j+1]:
//                 freqMap[grid[i][j]] = 2
//                 continue
//             if j-1>=0 and grid[i][j] == grid[i][j-1]:
//                 freqMap[grid[i][j]] = 2
//                 continue

//     moves = 0
//     maxFreq = 0
//     for x in freqMap:
//         freq = freqMap[x]
//         moves += freq
//         maxFreq = max(freq, maxFreq)
    
//     return (moves - maxFreq)

// cases = int(input())
// for i in range(cases):
//     print(helper())


// input e.g.:
// 4
// 1 1
// 1 (= 0)
// 3 3
// 1 2 1
// 2 3 2
// 1 3 1 (= 2)
// 1 6
// 5 4 5 4 4 5 (= 1)
// 3 4
// 1 4 2 2
// 1 4 3 5
// 6 6 3 5 (= 10)