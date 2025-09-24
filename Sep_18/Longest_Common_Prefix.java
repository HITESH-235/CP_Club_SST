package CP_Club_SST.Sep_18;

import java.util.*;


public class Longest_Common_Prefix {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>();
        A.add("abcadklsfkdsjf");
        A.add("abcadffgjfkdsjf");
        A.add("abcaxcvndsjf");
        System.out.println(longestCommonPrefix(A));
    }

public static String longestCommonPrefix(List<String> A){
    if (A == null || A.isEmpty()) return "";

    StringBuilder res = new StringBuilder();
// stringbuilder saves us from creating new string every time mutated
// it is mutable
    int i=0;
    while (true) {
        char curr = A.get(0).charAt(i);
        boolean flag = true;
        for (String s:A) {
            if (s.charAt(i) != curr) {  flag = false;
                                        break; }
        }
        if (flag) { res.append(curr); }
        else { break; }
        i++;
    }
    return String.valueOf(res); // dont forget to convert back to string
}
}


// ______________________________________________________Procedure Explained:______________________________________________________

// 1.iterate (n = length of smallest word in A) no. of times
//   declare curr as first word's first char (later as ith letter); also use a mark flag variable; (true by default)

// 2.if all other words in A, have that same char at same index, then dont break the nested loop
//   (check by iterating in nested loop in A), if not found, we break both loops one by one using mark flag

// 3.to do this break, first unmark flag if same char is not found
//   put an if else in parent loop outside nested loop to check flag is marked or not

// 4.if marked, append this current letter to result
//   if unmarked, we can no longer look into further letters of all words, as problem asks similar "prefix chars" only

// 5.hence return this res variable at the end 
//   edge case: (if no letter similar; both loops will break one by one at first step, hence res="" still)
// ________________________________________________________________________________________________________________________________