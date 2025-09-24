# Prefix Sum Addicts
# CODEFORCES link: https://codeforces.com/problemset/problem/1738/B

def helper(n,k,prefixSums):
    res = float('inf')

    for i in range(k-1,0,-1):
        if res < prefixSums[i] - prefixSums[i-1]:
            return "NO"
        res = prefixSums[i] - prefixSums[i-1]

    if prefixSums[0] <= (n-k+1)*res:
        return "YES"
    
    return "NO"

cases = int(input())
for i in range(cases):
    n,k = map(int, input().split(" "))
    prefixSums = list(map(int, input().split()))
    print(helper(n,k,prefixSums))

# 4
# 5 5
# 1 2 3 4 5
# 7 4
# -6 -5 -3 0
# 3 3
# 2 3 4
# 3 2
# 3 4