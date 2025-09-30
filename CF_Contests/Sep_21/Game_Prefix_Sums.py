# Game of Prefix Sums
# CODEFORCES link: https://codeforces.com/gym/636587/problem/F

cases = int(input())
for i in range(cases):
    r = int(input())
    red = list(map(int, input().split()))
    b = int(input())
    blue = list(map(int, input().split()))

    max_red = 0
    max_blue = 0
    temp=0
    for i in range(r):
        temp += red[i]
        max_red = max(temp,max_red)
    temp=0
    for i in range(b):
        temp += blue[i]
        max_blue = max(temp,max_blue)
    print(max_red + max_blue)

# 4
# 4
# 6 -5 7 -3
# 3
# 2 3 -4
# 2
# 1 1
# 4
# 10 -3 2 2
# 5
# -1 -2 -3 -4 -5
# 5
# -1 -2 -3 -4 -5
# 1
# 0
# 1
# 0