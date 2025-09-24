// return 1 if all 

package CP_Club_SST.Sep_18;

import java.util.*;
public class Isalnum {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>();
        A.add('2');
        A.add('a');
        A.add('A');
        A.add('3');
        A.add('3');

        System.out.println(isAlphanumeric(A));
    }
    public static int isAlphanumeric(ArrayList<Character> A) {
        for (char ch:A) {
            int temp = ch;
            if (  !((temp>=48 && temp<=57) ||
                    (temp>=65 && temp<=90) ||
                    (temp>=97 && temp<=122))  ) { return 0; }
        }
        return 1;
    }
}