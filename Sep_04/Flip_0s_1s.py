# def flip_PrefixSum(A):
#     n = len(A)
#     prefix_0s = []
#     prefix_1s = []
#     count_0s = 0
#     count_1s = 0
#     for c in A:
#         if c == "0":
#             count_0s += 1 
#         else:
#             count_1s += 1
#         prefix_0s.append(count_0s)
#         prefix_1s.append(count_1s)
#     val = [prefix_0s[i]-prefix_1s[i] for i in range(n)]
#     # gain(L,R)=(#zeros in [L,R])−(#ones in [L,R])
#     # gain(L,R)=(prefix_zeros[R]−prefix_zeros[L−1])−(prefix_ones[R]−prefix_ones[L−1])
#     # gain(L,R)=((prefix_zeros[R]−prefix_ones[R]))−((prefix_zeros[L−1]−prefix_ones[L−1])
#     # val[i]=prefix_zeros[i]−prefix_ones[i]
#     min_diff = float('inf')
#     res = []
#     l = 0
#     r = 0
#     max_gain = -1

#     while l <= r and r<n:
#         gain = val[r] - val[l]
#         if gain <= max_gain:
#             l = r
#             min_diff = float('inf')
#         else:
#             min_diff = min(r-l,min_diff)
#             res = [l+1, r+1]
#             max_gain = gain
#         r += 1

        
#     return res

# s = "000110000"
# print(flip_PrefixSum(s))

def Flip_kdAlgo(A):
    n = len(A)
    arr = []
    for x in A:
        if x == "0":
            arr.append(1)
        else:
            arr.append(-1)
    max_sum = 0
    curr_sum = 0
    start = 0
    res = []
    for i in range(n):
        curr_sum += arr[i]
        if curr_sum > max_sum:
            max_sum = curr_sum
            res = [start+1, i+1]
        if curr_sum < 0:
            curr_sum = 0
            start = i+1
    return res

A = "00010101110100101010"
print(Flip_kdAlgo(A))