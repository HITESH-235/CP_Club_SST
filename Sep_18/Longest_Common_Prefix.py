# Longest Common Prefix
# Given a list of strings, return the longest common prefix in all those strings


def longestCommonPrefix(A):
    i = 0
    res = ""
    while True:
        curr = A[0][i]
        flag = True
        for j in range(1,len(A)):
            if A[j][i] != curr:
                flag = False
                break
        if flag: 
            res += curr
        else: break
        i += 1
    return res


A = ["abckasd","abcjdfaskdja","abcajksdfksjf"]
print(longestCommonPrefix(A))


# ______________________________________________________Procedure Explained:______________________________________________________

# 1.iterate (n = length of smallest word in A) no. of times
#   declare curr as first word's first char (later as ith letter); also use a mark flag variable; (true by default)

# 2.if all other words in A, have that same char at same index, then dont break the nested loop
#   (check by iterating in nested loop in A), if not found, we break both loops one by one using mark flag

# 3.to do this break, first unmark flag if same char is not found
#   put an if else in parent loop outside nested loop to check flag is marked or not

# 4.if marked, append this current letter to result
#   if unmarked, we can no longer look into further letters of all words, as problem asks similar "prefix chars" only

# 5.hence return this res variable at the end 
#   edge case: (if no letter similar; both loops will break one by one at first step, hence res="" still)
# ________________________________________________________________________________________________________________________________