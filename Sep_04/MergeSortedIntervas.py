# You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values. Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.

# def solve(A):
#     A.sort(key=lambda x: x[0])
#     print(A)
#     n = len(A)
#     B = {}
#     i = 0
#     while i <= (n-1):
#         j = i+1
#         while j<n and A[i][1] >= A[j][0]:
#             B[A[i][0]] = max(A[j][1], A[i][1])
#             j += 1
#         if (i < n-1) and (A[i][1] < A[i+1][0]):
#             B[A[i][0]] = A[i][1]
#         elif i== n-1:
#             B[A[i][0]] = A[i][1]
#         i = j

#     C = []
#     for x,y in B.items():
#         C.append([x,y])
#     return C

def MergeSortedIntervals(A):
    A.sort(key=lambda x: x[0])
    st = [A[0]] # stores result
    n = len(A)
    for i in range(1,n):
        last = st[-1] # both last and st[-1] are same
        curr = A[i]
        if curr[0] <= last[1]:
            last[1] = max(last[1], curr[1]) # [1] of next might be smaller than curr's [1]
        else:
            st.append(curr)
    return st

def solve(A):
    A.sort(key=lambda x: x[0])
    st = [] # stores result
    n = len(A)
    for i in range(n):
        if not st or st[-1][1] < A[i][0]:
            st.append(A[i])
        else:
            st[-1][1] = max(A[i][1], st[-1][1])
    return st

nums = [[1, 3], [2, 6], [8, 10] ,[11,15], [12, 18]]
nums = [[1,4],[0,2],[3,5]]
# print(MergeSortedIntervals(nums))
print(solve(nums))