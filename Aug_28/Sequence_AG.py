# You have given a string A having Uppercase English letters. You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.


def solve(A):
    count = 0
    p_sum = []
    n = len(A)
    for i in range(n):
        if A[i] == 'A':
            count += 1
        p_sum.append(count)
    count = 0
    for i in range(n-1,-1,-1):
        if A[i] == 'G':
            count += p_sum[i]
    return count


def solve_2(A):
    count = 0
    res = 0
    n = len(A)
    for i in range(n):
        if A[i] == 'A':
            count += 1
        if A[i] == "G":
            res += count    
    return res


from time import time
A = "ASAGKAFAGKGJDGFJGAJKGDKDJKGDKJGJFJGAGJAGJAGJAKJGJDKJKDJGG"
start = time()
print(solve_2(A))
end = time()
print(end-start)
start = time()
print(solve(A))
end = time()
print(end-start)