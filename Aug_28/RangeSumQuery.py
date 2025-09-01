# You are given an integer array A of length N.
# You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
# For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
# More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
# LEETCODE link: https://leetcode.com/problems/range-sum-query-immutable/description/

def bruteforce(A, B):
    res = []
    for x, y in B:
        total = 0
        for i in range(x, y+1):
            total += A[i]
        res.append(total)
    return res

def sumRange_interviewbit(A,B):
    prefix_sum = []
    temp = 0
    for i in range(len(A)):
        temp += A[i]
        prefix_sum.append(temp)
    res = []
    for x,y in B:
        res.append(prefix_sum[y]-prefix_sum[x]+A[x])
    return res

A = [1,2,3,4,5]
B = [[0,3], [1,2], [0,4]]
print(sumRange_interviewbit(A,B))