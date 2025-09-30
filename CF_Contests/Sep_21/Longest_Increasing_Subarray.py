# Protect Your Laptop; Longest Strictly Increasing Subarray
# CODEFORCES link: https://codeforces.com/gym/636587/problem/A
# LEETCODE link: https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

# Leetcode solution:
def longestIncreasingSubarray(nums):
    n = len(nums)
    i = 0
    res = 1
    while i<n-1:
        if nums[i] < nums[i+1]:
            count = 1
            while i<n-1 and nums[i] < nums[i+1]:
                i += 1
                count += 1
            res = max(res,count)
        else:
            i += 1
    return res

# CodeForces solution:
n = int(input())
nums = list(map(int, input().split()))
print(longestIncreasingSubarray(nums))