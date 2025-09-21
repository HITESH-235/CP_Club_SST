# Maxim and Biology: ACTG (genome substring)
# CODEFORCES link: https://codeforces.com/problemset/problem/1151/A

n = int(input())
s = str(input())

min_operations = float('inf')
def min_steps(x,y):
    diff = abs(ord(x)-ord(y))
    return min(diff, 26-diff) # since have to check in circular alphabets

i = 3
while i<n:
    curr_operations = min_steps(s[i-3],'A') + min_steps(s[i-2],'C') + min_steps(s[i-1],'T') + min_steps(s[i],'G')
    min_operations = min(min_operations, curr_operations)
    i += 1
print(min_operations)