# XORwice
# CODEFORCES link: https://codeforces.com/problemset/problem/1421/A
cases = int(input())
for i in range(cases):
    a,b = map(int, input().split())
    print(min(a+b,a^b))