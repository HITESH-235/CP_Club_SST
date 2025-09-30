# Submission is all you need
# CODEFORCES link: https://codeforces.com/problemset/problem/2130/A

cases = int(input())
for i in range(cases):
    n = int(input())
    s = input().split()
    arr = list(map(int, s))
    map_ = {}
    for x in arr:
        map_[x] = map_.get(x,0) +1

    score = 0
    mex = 0
    while map_.get(mex,0) > 0:
        map_[mex] -= 1
        mex += 1
    score += mex

    sum_ = 0
    for x,y in map_.items():
        sum_ += x*y
    score += sum_
    print(score)
# ________________________________________________________________________________________________________________________________
cases = int(input())
for i in range(cases):
    n = int(input())
    arr = list(map(int, input().split()))

    sum_ = sum(arr)
    zero_count = arr.count(0)
    print(zero_count + sum_)

# ______________________________________________________Question Explained:_______________________________________________________

# 1.There are two functions we need to know before coming to question:
#   MEX(arr): returns the smallest non negative integer "not" present in arr; e.g.[0,1,1,3] --> "2"
#   SUM(arr): returns the sum of all elements (same as default)

# 2.We have been given an arr with non negative integers
#   We can apply these two functions any number of times, but on one subset of the arr; such that;
#   if S' is a subset of S; say we do MEX(S') then we add the res to a score (=0 initially) variable
#   then we remove items of S' from S (main arr); and further we apply SUM(S''); where S'' is subset of (S-S')
#   add this SUM(S'') to score as well

# 3.One important point to know is that we can apply this function any number of times on a subset of S
#   Also keep in mind to remove items of that subset from main arr for next operation   

# * Return the max score that can be obtained from picking subsets and applying mex,sum

# ______________________________________________________Procedure Explained:______________________________________________________

# 1.one obvious thing to assume is that leaving more* "strictly positive integer" in S after doing MEX is necessary
#   so we can apply SUM on that leftover arr to get max sum
#   one more thing is obvious, is that using SUM again on the leftover arr is pointless
#   because say we use SUM([1,2,2,3]) then arr is updated to be "[]" (empty); hence we assume to use SUM only once

# 2.but the same point is not valid for MEX, we may use it again to increase score even more
#   say we got [0,0,2,3]; then two subsets; that are; {0} and {0} give MEX = 1 and 1 (total 2) respectively; leftover S = [2,3]
#   if we use {0,0} as a collective subset; we get MEX = 1; total = 2; leftover S = [2,3]; hence not the maximum possible

# 3.Question arises why we are counting zeroes instead of calculating MEX
#   because all other positive numbers will contribute to SUM; hence we use {0}'s for MEX repeatedly

# 4.Say we take {0,0} for MEX, score += 1; leftover S = [2,3]
#   then SUM(S) = 2+3 = 5; final score = 6*

#   but if use MEX twice on {0} and {0}, score += 1 + 1; leftover S = [2,3]
#   then SUM(S) = 2+3; final score = 7; hence 7 is result

# 5.take another example; S = [0,1,3]
#   count 0s: MEX = 1; score += 1; leftover S = [1,3]
#   SUM(S) = 1+ 3; final score = 5

#   but if we take MEX for [0,1], score += 2; which you might think be better; leftover S = [3]
#   then SUM(S) = SUM([3]) = 3; final score = 2 + 3
# ________________________________________________________________________________________________________________________________

# Conclusion: it is better to use separate {0}'s subset for mex and leave positive numbers for SUM
# Hence the mapping method to get frequency will not always give the maximum score possible
# (mapping method could have been right; if we were restricted to using MEX and SUM only once)
# So in counting {0} method; count all the zeroes present in arr; and get SUM of all nums
# ________________________________________________________________________________________________________________________________
