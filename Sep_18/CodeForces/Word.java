// Return word in lowercase if more or equal lowercase letters  compared to uppercase (else return in uppercase)
// CODEFORCES link: https://codeforces.com/problemset/problem/59/A   

package CP_Club_SST.Sep_18.CodeForces;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int count_upper=0, count_lower=0;
        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) { count_upper++; }
            else { count_lower++; }
        }

        if (count_upper <= count_lower) { System.out.println(s.toLowerCase()); }
        else { System.out.println(s.toUpperCase()); }
        sc.close();
    }
}