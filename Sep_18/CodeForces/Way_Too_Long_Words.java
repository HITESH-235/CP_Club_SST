// Way too long words
// CODEFORCES link: https://codeforces.com/problemset/problem/71/A
// print given word; if greater than 10 length; abbreviate it into short form
// e.g.linguistics (11): l9s; environment (11): e9t

package CP_Club_SST.Sep_18.CodeForces;
import java.util.*;
public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for (int u=0; u<cases; u++) {
            String s = sc.nextLine();
            int len = s.length();

            if (len>10) {
                System.out.print(s.charAt(0));
                System.out.print(len-2);
                System.out.print(s.charAt(len-1));
                System.out.println();
            }
            else { System.out.println(s); }
        }
        sc.close();
    }
}
