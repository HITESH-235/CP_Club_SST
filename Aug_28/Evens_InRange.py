# You are given an array A of length N and Q queries given by the 2D array B of size Q×2. Each query consists of two integers B[i][0] and B[i][1]. For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

def sumRange(A,B):
    prefix_sum = []
    temp = 0
    for i in range(len(A)):
        if A[i] % 2 == 0:
            temp += 1
        prefix_sum.append(temp)
    res = []
    for x,y in B:
        right = prefix_sum[y]
        left = prefix_sum[x-1] if x!=0 else 0 
        res.append(right-left)
    return res

A = [3,1,5,7,5,2]
B = [[0,2]]
print(sumRange(A,B))