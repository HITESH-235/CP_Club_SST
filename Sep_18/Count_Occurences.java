package CP_Club_SST.Sep_18;

public class Count_Occurences {
    public static void main(String[] args) {
        String s = "bobbobobobobobobboa";
        System.out.println(countOccurencesBob(s));
    }

    public static Integer countOccurencesBob(String s) {
        int count = 0;
        for (int i=0; i<(s.length()-2); i++) {
            if ((int)s.charAt(i) == 98 && (int)s.charAt(i+1) == 111 && (int)s.charAt(i+2) == 98) {
                i += 1;
                count++;
            }
        }
        return count;
    }
}