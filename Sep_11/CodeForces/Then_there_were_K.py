# And then there were K
# CODEFORCES link: https://codeforces.com/problemset/problem/1527/A

cases = int(input())
for i in range(cases):
    n = int(input())

    i = 0
    while (1<<i) <= n:
        i += 1

    print((1<<(i-1)) - 1)

# e.g. 1010 = 10
# ans is (1000) -1 = 8- 1 = 7
# because 1010(10) ^ 1001(9) ^ 1000(8) = 1000(8), this happens for nearest power of 2
# as power of two contains all zeroes except leftmost set bit
# hence doing this xor result in that power of 2 as result
# now, 1000(8) ^ 0111 (8-1) = 0000 always
# that is why we just move just 1 below this power of 2