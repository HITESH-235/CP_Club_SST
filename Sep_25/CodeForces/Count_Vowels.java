// Count Vowels in a given string
// CODEFORCES link:  https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/I

package CP_Club_SST.Sep_25.CodeForces;
import java.util.*;

public class Count_Vowels {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(countVowels(s,0));
            sc.close();
    }
static int countVowels(String s, int index) {
    if (index == s.length()) {return 0;}
    char curr = s.charAt(index);
    int isVowel = (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U') ? 1 : 0;
    return isVowel + countVowels(s,index+1);
}
}