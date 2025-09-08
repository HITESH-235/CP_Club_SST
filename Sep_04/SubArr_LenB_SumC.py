# Given an array A of length N. Also given are ints B and C. Return 1 if there exists a subarray with length B having sum C and 0 otherwise

def solve(A,B,C):
    n = len(A)
    prefix_sum = [0]
    for i in range(1,n+1):
        prefix_sum.append(prefix_sum[i-1] + A[i-1])
    sum_ = 0
    for i in range(B,n+1):
        if prefix_sum[i] - prefix_sum[i-B] == C:
            return 1
    return 0

nums = [2,1,3,4,5]
B = 3
C = 12
print(solve(nums, B, C))