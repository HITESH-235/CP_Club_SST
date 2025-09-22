# Life Choices: Transform A to B through (+1) or (^1) with costs x,y respectively, minimise cost
# CODEFORCES link: https://codeforces.com/gym/636587/problem/B

# Each test contains multiple test cases. The first line contains the number of test cases t.
# The description of the test cases follows.
# The only line of each test case contains four integers a,b,x,y — the two integers given to Vibhu and the respective costs of two types of operations.

def helper(a,b,x,y):
    if a == b: return 0
    if a>b: 
        if a-1 == b and (a&1): return y
        else: return -1
    if x <= y: return (b-a)*x
    if not ((b-a)&1): return ((b-a)>>1)*(x+y)

    more = (b-a+1)>>1
    less = (b-a-1)>>1
    if not (a&1):
        return more*y + less*x
    else:
        return more*x + less*y

# from an odd value a=1; a^1 is 0 for odd no. of operations, and 1 for even no. operations
# from an even value a=2; a^1 is 3 for odd no. of operations, and 2 for even no. operations

# Hence for even no. we can (+1) if required from cost Y
# But for an odd no. we can go back (-1) if required from cost Y

# So we have to use cost X alternatively if (x > y):
# if x<=y; then just use x; (b-a) no. of times

# case: x > y; (b-a) is odd;
# choose which one of X and Y has to be more or less
# if a is at even; then we can start with Y and thus Y is more
# otherwise we must start with X (even though x>y) and thus X is more 

cases = int(input())
for u in range(cases):
    a,b,x,y = map(int, input().split(" "))
    print(helper(a,b,x,y))

# 7
# 1 4 1 2 = 3
# 1 5 2 1 = 6
# 3 2 2 1 = 1
# 1 3 2 1 = 3
# 2 1 1 2 = -1
# 3 1 1 2 = -1
# 1 100 10000000 10000000 = 990000000