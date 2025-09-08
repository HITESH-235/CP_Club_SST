# Kuriyama Mirai's Stones
# CODEFORCES link: https://codeforces.com/problemset/problem/433/B

n = int(input())
arr = []
prefix_sum = [0]
arr = (input()).split()

for i in range(n):
    arr[i] = int(arr[i])
    prefix_sum.append(prefix_sum[i] + arr[i])

arr.sort()
prefix_sum_sorted = [0]
for i in range(n):
    prefix_sum_sorted.append(prefix_sum_sorted[i] + arr[i])

def unsorted_prefix_sum(n2,n3):
    return prefix_sum[n3] - prefix_sum[n2-1]

def sorted_prefix_sum(n2,n3):
    return prefix_sum_sorted[n3] - prefix_sum_sorted[n2-1]

m = int(input())
for i in range(m):
    nums = (input()).split() 
    
    if int(nums[0]) == 1:
        print(unsorted_prefix_sum(int(nums[1]),int(nums[2])))
    if int(nums[0]) == 2:
        print(sorted_prefix_sum(int(nums[1]),int(nums[2])))

# e.g.
# 6 
# 6 4 2 7 2 7
# 3
# 2 3 6
# 24
# 1 3 4   
# 9
# 1 1 6
# 28