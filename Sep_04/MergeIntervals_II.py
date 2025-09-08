# You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).You may assume that the intervals were initially sorted according to their start times.

def mergeIntervals_II(A, B):
    # A is the given 2d array, insert B (element) inside it and then merge
    n = len(A)
    A.append(-1) # putting extra element at back
    pos = -1

    for i in range(n): # finding position to put B at
        if A[i][0] > B[0]:
            pos = i
            break

    for i in range(n,pos,-1): # shifting every element after pos
        A[i] = A[i-1]
    A[pos] = B

    A.sort(key=lambda x: x[0]) # applying merge sorted array stack technique
    st = [] 

    n = len(A)
    for i in range(n):
        if not st or st[-1][1] < A[i][0]:
            st.append(A[i])
        else:
            st[-1][1] = max(A[i][1], st[-1][1])
    return st

nums = [[1, 3], [6, 9], [2,3], [0,9], [-1,2], [-9,-7]]
B = [0,9]
print(mergeIntervals_II(nums, B))