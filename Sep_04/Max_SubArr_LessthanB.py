# You are given a subarray C of size A. Now you need to find a subarray (contiguous elements) so that the sum if contiguous elements is maximum. But the sum must not exceed B.

# def maxSubArray(C, B):
#     A = len(C)
#     prefix_sum = [0]
#     for i in range(1,A+1):
#         prefix_sum.append(prefix_sum[i-1] + C[i-1])
#     print(prefix_sum)
#     sum_ = 0
#     i = 0
#     res = -float('inf')
#     while i < A:
#         gap = None
#         sum_ += C[i]
#         for j in range(i+1):
#             if prefix_sum[j] >= sum_ - B:
#                 gap = prefix_sum[j]
#                 print(prefix_sum[j])
#             if gap:
#                 res = max(res, sum_- gap)
#         i += 1
#     return res

def maxSubArray(nums, k):
    n = len(nums)
    prefix_sum = [0]
    for i in range(1,n+1):
        prefix_sum.append(prefix_sum[i-1] + nums[i-1])
    sum_ = 0
    res = -float('inf')
    for i in range(n+1):
        for j in range(i+1):
            if prefix_sum[i] - prefix_sum[j] <= k:
                res = max(prefix_sum[i] - prefix_sum[j], res)
        i += 1
    return res

nums = [2,1,3,4,5]
k = 12
print(maxSubArray(nums, k))
