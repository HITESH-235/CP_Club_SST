# A string is called good if it does not contain "010" or "101" as a subsequence  — for instance, "1001" contains "101" as a subsequence, hence it is not a good string, while "1000" doesn't contain neither "010" nor "101" as subsequences, so it is a good string.
# What is the minimum number of operations he will have to perform, so that the string becomes good? It can be shown that with these operations we can make any string good.
# CODEFORCES link: https://codeforces.com/problemset/problem/1363/B

inputs = int(input())
def subsequence_hate(s):
    n = len(s)

    prefix_zeroes = []
    prefix_ones = []
    count_0 = 0
    count_1 = 0
    for i in range(n):
        if s[i] ==  "0":
            count_0 += 1
        else:
            count_1 += 1
        prefix_zeroes.append(count_0)
        prefix_ones.append(count_1)

    # one answer could be flipping all the 1s or 0s (whichever is less in count):
    res = min(count_1, count_0)

    # flipping all 0s before ind and all 1s from ind to n, e.g. 1110000
    for i in range(n):
        # prefix_zeroes[i] = all 0s from 0 --> i-1
        # count_1 - prefix_ones[i] = all 1s from i --> n
        flips = prefix_zeroes[i] + (count_1 - prefix_ones[i])
        res = min(res, flips)

    # flipping all 0s before ind and all 1s from ind to n, e.g. 001111
    for i in range(n):
        # prefix_ones[i] = all 1s from 0 --> i-1
        # count_0 - prefix_zeroes[i] = all 0s from i --> n
        flips = prefix_ones[i] + (count_0 - prefix_zeroes[i])
        res = min(res, flips)
    print(res)

for x in range(inputs):
    s = str(input()).strip()
    subsequence_hate(s)

# e.g.
# 7
# 001
# 100
# 101
# 010
# 0
# 1
# 001100