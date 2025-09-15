# You are given a n x n 2D matrix A representing an image. Rotate the image by 90 degrees (clockwise).
# Constraint - Dont use extra space

def rotate_matrix(A):
    n = len(A) # 
    for i in range(n):
        for j in range(n):
            if i < j:
                temp = A[i][j]
                A[i][j] = A[j][i]
                A[j][i] = temp
    print(A)
    for i in range(n): # reversal of matrix
        l = 0
        r = n-1
        for j in range(n):
            if l < r:
                temp = A[i][l]
                A[i][l] = A[i][r]
                A[i][r] = temp
            l += 1
            r -= 1
    return A

A = [[1,2,3],
     [4,5,6],
     [7,8,9] ]
print(rotate_matrix(A))
for x in A:
    print(x)
print()
A = [[0,0,0],[0,1,0],[1,1,1]]
for x in A:
    print(x)
print()


# Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
# LEETCODE link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

def findRotation(A, target):
        for i in range(4):
            n = len(A)
            for i in range(n):
                for j in range(n):
                    if i < j:
                        temp = A[i][j]
                        A[i][j] = A[j][i]
                        A[j][i] = temp

            for i in range(n):
                l = 0
                r = n-1
                for j in range(n):
                    if l < r:
                        temp = A[i][l]
                        A[i][l] = A[i][r]
                        A[i][r] = temp
                    l += 1
                    r -= 1

            if A == target: return True
        return False