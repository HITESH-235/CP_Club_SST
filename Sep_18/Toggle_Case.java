package CP_Club_SST.Sep_18;

public class Toggle_Case {
    public static void main(String[] args) {
        String s = "ThIs Is A SeNtEnCe";
        System.out.println(toggleCase(s));
    }
    
    public static String toggleCase(String s) {
        StringBuilder res = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            int curr = s.charAt(i);
            if (curr>=65 && curr<=90) { res.append((char)(curr+32)); }

            else if (curr>=97 && curr<=122) { res.append((char)(curr-32)); }

            else { res.append(s.charAt(i)); }
        }
        return String.valueOf(res);
    }
}
