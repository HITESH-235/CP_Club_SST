# Black and white stripe
# CODEFORCES link: https://codeforces.com/problemset/problem/1690/D

def helper(n,k,stripe):
    prefix_whites = [0]
    for i in range(1,n+1):
        if stripe[i-1] == "W":
            prefix_whites.append(prefix_whites[i-1]+1)
        else:
            prefix_whites.append(prefix_whites[i-1])
    l = 1
    r = k
    flips = float('inf')
    if n == k:
        return prefix_whites[-1]
    while r<n+1:
        flips = min(flips, prefix_whites[r]-prefix_whites[l-1])
        l += 1
        r += 1
    return flips

cases = int(input())
for i in range(cases):
    s = input().split()
    lst = list(map(int,s))
    n = lst[0]
    k = lst[1]
    stripe = input()
    print(helper(n,k, stripe))