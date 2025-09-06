# You've got string s = s1s2... sn (n is the length of the string), consisting only of characters "." and "#" and m queries. Each query is described by a pair of integers li, ri (1 ≤ li < ri ≤ n). The answer to the query li, ri is the number of such integers i (li ≤ i < ri), that si = si + 1.
# CODEFORCES link : https://codeforces.com/problemset/problem/313/B

s = input().strip()
n = len(s)

prefix_sum = [0]
count = 0
for i in range(1, n):
    if s[i] == s[i-1]:
        count += 1
    prefix_sum.append(count)

m = int(input())
for _ in range(m):
    parts = input().split(" ")
    l = int(parts[0])
    r = int(parts[1])
    print(prefix_sum[r-1] - prefix_sum[l-1])