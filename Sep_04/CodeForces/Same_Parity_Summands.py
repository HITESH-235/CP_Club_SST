# Same Parity Commands
# CODEFORCES link: https://codeforces.com/problemset/problem/1352/B

def helper(n,k):
    if n==k:
        print("YES")
        s = ""
        for i in range(k):
            print("1 ",end="")
        print()
# checking if all odd summands:
# removing k no. of 1s and checking if n is even or not
# e.g. 96;4; 96 - 4*1 = 92 = even; hence odd summands: 1,1,1,(96-k+1) = (93)
    elif n>k and (n-k)%2 == 0: 
        print("YES")
        print("1 "*(k-1) + f"{n-k+1}")
# checking if all even summands:
# removing k no. of 2s and checking if n is even or not
# e.g. 96;4; 96 - 8 = 88 = even; hence even summands: 2,2,2,(96-2k+2) = (90)
    elif n>=2*k and (n-2*k)%2 == 0:
        print("YES")
        print("2 "*(k-1) + f"{n-2*k+2}")
    else:
        print("NO")

cases = int(input())
for i in range(cases):
    s = input().split()
    lst = list(map(int,s))
    n = lst[0]
    k = lst[1]
    helper(n,k)

# e.g.
# 8
# 10 3
# 100 4
# 8 7
# 97 2
# 8 8
# 3 10
# 5 3
# 1000000000 9