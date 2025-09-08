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

    awake_mins = 0
    for i in range(k, n+1):
        awake_mins = max(awake_mins, prefix_sum[i] - prefix_sum[i-k])
    print(awake_mins + total)
# e.g.
# 6 3                                     
# 1 3 5 2 5 4                             
# 1 1 0 1 0 0                             
# 16 