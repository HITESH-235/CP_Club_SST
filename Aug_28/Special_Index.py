# Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
# GEEKSFORGEEKS link: https://www.geeksforgeeks.org/dsa/count-ways-to-make-sum-of-odd-and-even-indexed-elements-equal-by-removing-an-array-element/

def brute_force(nums):
    n = len(nums)
    res = 0
    for i in range(n):
        even_sum = 0
        odd_sum = 0
        index = 0
        for j in range(n):
            if j==i:
                continue
            else:
                if index%2 == 0:
                    even_sum += nums[j]
                else:
                    odd_sum += nums[j]
            index += 1
        if even_sum == odd_sum:
            res += 1
    return res

def optimised(nums):
    r_odd_sum = 0
    r_even_sum = 0
    n = len(nums)
    for i in range(n):
        if i%2 == 0:
            r_odd_sum += nums[i]
        else:
            r_even_sum += nums[i]

    l_even_sum = 0
    l_odd_sum = 0
    res = 0
    for i in range(n):
        if i%2 == 0:
            r_odd_sum -= nums[i]
        else:
            r_even_sum -= nums[i]

        if (l_even_sum + r_odd_sum) == (l_odd_sum + r_even_sum):
            res += 1

        if i%2 == 0:
            l_odd_sum += nums[i]
        else:
            l_even_sum += nums[i]
    return res

nums = [2,1,6,4]
print(optimised(nums))
print(brute_force(nums))