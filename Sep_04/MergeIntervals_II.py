# You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).You may assume that the intervals were initially sorted according to their start times.


# Method for adding interval when input is sorted already (still used sort just in case)- O(n) complexity at best
def sorted_InsertInterval(A, B):
    # A is the given 2d array, insert B (element) inside it and then merge
    n = len(A)
    A.append([0,0]) # putting extra element at back
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

# if the given input isn't sorted- O(nlogn) complexity
def unsorted_InsertInterval(A, B):
    A.append(B)
    A.sort(key=lambda x:x[0])
    st = [A[0]]
    for i in range(len(A)):
        if st[-1][1] > A[i][0]:
            st[-1][1] = max(st[-1][1], A[i][1])
        else:
            st.append(A[i])
    return st

nums = [[1, 3], [6, 9], [2,3], [0,9], [-1,2], [-9,-7]]
B = [0,9]
print(sorted_InsertInterval(nums, B))
print(unsorted_InsertInterval(nums, B))