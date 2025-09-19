# Return max of all subarray sums possible (non empty only)
def maxSubArray(nums):
    total = 0
    res = -float('inf')
    for i in range(len(nums)):
        total = max(nums[i], total+nums[i])
        res = max(res, total)
    return res
# return res if res if res >= 0 else 0 (if empty subarray allowed)

# another way of writing this (conventional kds algo):
def maxSubArray_KD(nums):
    total = 0
    res = max(nums)
    for i in range(len(nums)):
        total += nums[i]
        res = max(total,res)
        if total < 0:
            total = 0
    return res


# Return min of all subarray sums possible (non empty only)
def minSubArray(nums):
    res = float('inf')
    total = 0
    for i in range(len(nums)):
        total = min(nums[i], total + nums[i])
        res = min(res, total)
    return res
# return res if res if res >= 0 else 0 (if empty subarray allowed)

# Return min of all subarray sums possible (non empty only)
def minSubArray(nums):
    res = min(nums)
    total = 0
    for i in range(len(nums)):
        total += nums[i]
        res = min(res, total)

        if total>0:
            total = 0
    return res
# return res if res if res >= 0 else 0 (if empty subarray allowed)


# Printing the subarray with max/min sum:
def subArrays_withMaxSum(nums):
    sum_ = 0
    maximum = maxSubArray_KD(nums)
    res = set()
    start = 0
    for i in range(len(nums)):
        sum_ += nums[i]
        if sum_ == maximum:
            res.add(tuple(nums[start : i+1]))

        if sum_ < 0:
            sum_ = 0
            start = i+1
    return res

# Printing the subarray with max/min sum:
def subArrays_withMinSum(nums):
    sum_ = 0
    minimum = minSubArray(nums)
    res = set()
    start = 0
    for i in range(len(nums)):
        sum_ += nums[i]
        if sum_ == minimum:
            res.add(tuple(nums[start : i+1]))

        if sum_ > 0:
            sum_ = 0
            start = i+1
    return res

print()
import random
nums = [random.randint(-100,100) for _ in range(20)]
print(nums)
# nums = [2, -1, 2, 3, -4, 2, 3]
# nums = [1, -2, 3, 4, -1, 2, -5, 3, 4]
# nums = [-2, -3, 4, -1, -2, 1, 5, -3]
print(f"Max of all subarray sums = ({maxSubArray(nums)})")
print(f"Min of all subarray sums = ({minSubArray(nums)})")
print()
print(subArrays_withMaxSum(nums))
print(subArrays_withMinSum(nums))