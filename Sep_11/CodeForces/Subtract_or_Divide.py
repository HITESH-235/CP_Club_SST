# Subtract or Divide
# CODEFORCES link: https://codeforces.com/problemset/problem/1451/A

def helper(n):
    if n == 1 or n == 2 or n == 3:
        return (n-1)
    elif n%2 == 0:
        count = 1
        n //= n//2
        count += helper(n)
    else:
        count = 1
        n -= 1
        count += helper(n)
    return count

cases = int(input())
for i in range(cases):
    n = int(input())
    print(helper(n))