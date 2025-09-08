# Given an array A of length N, Find the maximum subarray sum out of all possible subarray of length B.

def MaxSubArr_FixLen(nums, k):
    n = len(nums)
    prefix_sum = [0]
    res = -float('inf')
    for i in range(1,n+1):
        prefix_sum.append(prefix_sum[i-1] + nums[i-1])
    for i in range(k,n+1):
        res = max(res, prefix_sum[i] - prefix_sum[i-k])
    return res

nums = [3, 9, 5, 6, 5, 11]
k = 3
print(MaxSubArr_FixLen(nums, k))