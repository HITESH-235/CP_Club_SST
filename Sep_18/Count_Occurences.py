# Count the number of times "bob" occurs in a string A with all lowercase alphabets

def countOccurencesBob(A):
    count = 0
    i = 0
    for i in range(len(A)-2): # so we can look for i+1 and i+2
        if ord(A[i]) == 98 and ord(A[i+1]) == 111 and ord(A[i+2]) == 98:
            count += 1
            i += 1
    return count

print(countOccurencesBob("bobbobobobobobobboa"))