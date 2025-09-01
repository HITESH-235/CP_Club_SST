def brute_force(nums):
    n = len(nums)
    res = 0
    for i in range(n):
        for j in range(i,n):
            for k in range(i, j+1):
                res += nums[k]
    return res

def pre_sum(nums):
    prefix_sum = []
    n = len(nums)
    total = 0
    for i in range(n):
        total += nums[i]
        prefix_sum.append(total)
    res = 0
    for i in range(n):
        res += nums[i]
        for j in range(i+1,n):
            r = prefix_sum[j]
            l = prefix_sum[i-1] if i != 0 else 0
            res += r-l
    return res

def optimised(nums):
    res = 0
    n = len(nums)
    for i in range(n):
        res += nums[i] * (n-i) * (i+1)
    return res

nums = [2,1,0,4]
print(brute_force(nums))
print(pre_sum(nums))
print(optimised(nums))