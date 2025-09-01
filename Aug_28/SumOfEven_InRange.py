# You are given:An integer array A representing the array of numbers of size N.
# A 2D array B of size Q, where each row B[i] contains two integers B[i][0] and B[i][1], representing the range [L, R].
# For each query in B, calculate the sum of elements in A at EVEN indices within the specified range [L, R] and return the results as an array.

def sumOfEvenInRange(A,B):
    temp = 0
    prefix_sum = []
    for i in range(len(A)):
        if i%2 == 0:
            temp += A[i]
        prefix_sum.append(temp)
    res = []
    for x,y in B:
        right = prefix_sum[y]
        left = prefix_sum[x-1] if x!=0 else 0
        res.append(right-left)
    return res