# Almost Ternary Matrix
# CODEFORCES link: https://codeforces.com/problemset/problem/1699/B

cases = int(input())
for c in range(cases):
    n,m = map(int, input().split())

    s = ""
    for i in range(27):
        if (i&1):
            s += "11"
        else:
            s += "00"

    ans = ""
    for i in range(n>>1):
        if (i&1):
            for j in range(m):
                ans += s[j+1]
                if j!=m-1: ans += " "

            ans += "\n"
            for j in range(m):
                ans += s[j+3]
                if j!=m-1: ans += " "

        else:
            for j in range(m):
                ans += s[j+3]
                if j!=m-1: ans += " "

            ans += "\n"
            for j in range(m):
                ans += s[j+1]
                if j!=m-1: ans += " "

        if i!=(n>>1)-1: ans += "\n"
    print(ans)