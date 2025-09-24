# Concatenate the string with itself.
# Delete all the uppercase letters.
# Replace each vowel with '#'.

def stringOperations(A):
    vowels = {97, 101, 105, 111, 117}
    res = ""
    for i in range(len(A)):
        ascii = ord(A[i])
        if not ascii in range(65,91): # checking for capital letters
            if ascii in vowels:
                res += "#" # checking for vowels
            else:
                res += A[i]
    return res*2 # concatenating at last (saves time)