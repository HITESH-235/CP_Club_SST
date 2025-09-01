# Given an array nums, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.

def closest_MinMax(nums):
    n = len(nums)
    min_val = min(nums)
    max_val = max(nums)

    min_index = -1
    max_index = -1

    res = float('inf')
    i = 0
    while i < n:
        if min_val == nums[i]:
            min_index = i
        if max_val == nums[i]:
            max_index = i
        if min_index != -1 and max_index != -1:
            res = min(res, abs(min_index - max_index)+1)
        i += 1
    return res

nums = [23,23,4,3,34,5,4,5,34,34,545,34,43,43,43,4,43,32]
print(closest_MinMax(nums))