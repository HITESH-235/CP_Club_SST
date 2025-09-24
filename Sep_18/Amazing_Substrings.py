# Amazing substrings are those substrings that begin with vowels: a,e,i,o,u, A,E,I,O,U

def amazingSubstrings(s):
    vowels = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117}
    res = 0
    for i in range(len(s)):
        if s[i] in vowels: res += len(s)-i
    return res%10003