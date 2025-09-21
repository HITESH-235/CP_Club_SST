# Sum of Round Numbers
# CODEFORCES link: https://codeforces.com/problemset/problem/1352/A

cases = int(input())
for i in range(cases):
    num = int(input())
    count = 0
    res = ""
    last = 0
    splits = 0
    while num>0:
        if last != 0:
            res += str(last)+"0"*(count-1)+ " "
            splits += 1
        last = num%10
        num = num//10
        count += 1
    res += str(last)+"0"*(count-1)
    print(splits+1)
    print(res)