# Minimal Square
# CODEFORCES link: https://codeforces.com/problemset/problem/1360/A

cases = int(input())

for i in range(cases):
    a, b = map(int, input().split())
    smaller = min(a,b)
    greater = max(a,b)
    if smaller*2 <= greater:
        print(greater**2)
    else:
        print((smaller*2)**2)