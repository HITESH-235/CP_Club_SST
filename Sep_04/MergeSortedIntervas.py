# You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values. Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.

def MergeSortedIntervals(A):
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

nums = [ [1, 3], [2, 6], [8, 10] ,[11,15], [12, 18]]
print(MergeSortedIntervals(nums))