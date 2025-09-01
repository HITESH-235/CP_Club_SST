# Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.Note: The rightmost element is always a leader.

def leadersInArray(arr):
    if not arr:
        return []
    res = [arr[-1]]
    temp = arr[-1]
    n = len(arr)
    for i in range(n-2,-1,-1):
        if temp < arr[i]:
            temp = arr[i]
            res.append(arr[i])
    return res[::-1]

arr = [16,17,3,1,4,5,2]
print(leadersInArray(arr))