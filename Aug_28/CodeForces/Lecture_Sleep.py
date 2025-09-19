# Lecture Sleep
# CODEFORCES link: https://codeforces.com/problemset/problem/961/B

first = input().split()
n = int(first[0]) # size of lecture (minutes)
k = int(first[1]) # window size
s1 = input().split()
theorems = list(map(int,s1))
s2 = input().split()
wake = list(map(int,s2))
if n == k:
    print(sum(theorems))
else:
    total = 0
    temp = 0
    prefix_sum = [0]

    for i in range(n):
        if wake[i] == 1:
            total += theorems[i]
        else:
            temp += theorems[i]
        prefix_sum.append(temp)

    max_subarr_sum = 0
    for i in range(k, n+1):
        max_subarr_sum = max(max_subarr_sum, prefix_sum[i] - prefix_sum[i-k])
    print(max_subarr_sum + total)
# e.g.
# 6 3                                     
# 1 3 5 2 5 4                             
# 1 1 0 1 0 0                             
# 16 

# ______________________________________________________Procedure Explained:______________________________________________________

# explaining input lines:
# 1.contains duration (mins) in lecture and window size (min we can keep awake)
# 2.arr with number of theorem taught in that (ith) minute of lecture (theorems* arr)
# 3.arr with 1s & 0s: 1 if awake; 0 if not (wake* arr)

# edge case: if duration of lecture is equal to window size, return total sum of arr

# 1.initialize one var (total =0) to store theorems she is already awake to see (will add total to ans at end)
#   another var (temp =0) to be used to make prefix sum arr
#   start looping through theorems arr

# 2.looping through duration arr, if she is awake at ith minute, add those lecture to total var
#   obviously if she is awake, then wake[i] = 1 else; add it to temp var
#   store this temp to prefix sum, regardless wake[i] = 0 or 1
#   hence for e.g.: theorems = [1,3,5,2,5,4]; wake = [1,1,0,1,0,0]; p_sum = [0,0,5,5,10,14]

# 3.now we just have to calculate max sub arr sum using this prefix sum
#   only difference is that theorems is "potrayed" as: [0,0,5,0,5,4]; hence ghosting awake minutes
#   and obv. our prefix sum is based on this potrayal as well
#   return (max_subarr_sum) + (total)
# ________________________________________________________________________________________________________________________________