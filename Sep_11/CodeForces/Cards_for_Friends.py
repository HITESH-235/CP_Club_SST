# Cards for friends
# CODEFORCES link: https://codeforces.com/problemset/problem/1371/A

# given a sheet of length and breadth w & h respec.
# we can cut it from any side only if that side has even measure
# hence if w is even then we get two sheets of (w/2 * h) area each
# hence determine if w*h sheet can be divided into n pieces or not; return only "YES" Or "NO"

# input:
# first line is number of queries
# next lines contains w,h,n where w*h is area and n is possible dvisions asked
# return in string "YES" or "NO"

def helper(w,h,n):
    if n==1 and w>0 and h>0:
        return "YES"
    count = 1
    while (w&1) == 0:
        w >>= 1
        count *= 2
        if count >= n: return "YES"

    while (h&1) == 0:
        h >>= 1
        count *= 2
        if count >= n: return "YES"
    return "NO"
cases = int(input())
for i in range(cases):
    w,h,n = map(int, input().split())
    print(helper(w,h,n))

# 5
# 2 2 3
# 3 3 2
# 5 10 2
# 11 13 1
# 1 4 4