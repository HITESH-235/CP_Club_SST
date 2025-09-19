# You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. 
# By flipping, we mean changing character 0 to 1 and vice-versa. 
# Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized. 
# If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

def Flip_kdAlgo(A):
    n = len(A)
    arr = []
    for x in A:
        if x == "0":
            arr.append(1)
        else:
            arr.append(-1)
    max_sum = -float('inf')
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

A = "0001011111111110101000"
print(Flip_kdAlgo(A))