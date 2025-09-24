package CP_Club_SST.Sep_18;
import java.util.*;
public class String_Operations {
    public static void main(String[] args) {
        System.out.println(stringOperation("AbcaZeoB"));
    }
    public static String stringOperation(String s) {
        // Set<Integer> vowels = Set.of(97,101,105,111,117);
        Set<Integer> vowels = new HashSet<>();
        vowels.add(97);
        vowels.add(101);
        vowels.add(105);
        vowels.add(111);
        vowels.add(117);
        
        StringBuilder res = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            int ascii = (char)s.charAt(i);

            if (ascii<65 || ascii>91) {
                if (vowels.contains(ascii)) { res.append("#"); }
                else { res.append(s.charAt(i)); }
            }
        }
        return String.valueOf(res)+String.valueOf(res);
    }
}
