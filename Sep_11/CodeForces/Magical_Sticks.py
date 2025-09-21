# Magical Sticks
# CODEFORCES link: https://codeforces.com/problemset/problem/1371/A

cases = int(input())
for i in range(cases):
    n = int(input())
    if n%2 == 0:
        print(n>>1)
    else:
        print((n+1)>>1)