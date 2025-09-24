// Amazing substrings are those substrings that begin with vowels: a,e,i,o,u, A,E,I,O,U

package CP_Club_SST.Sep_18;

import java.util.*;

public class Amazing_Substrings {
    public static void main(String[] args) {
        String s = "AzZGBauYuTknYjjWEEbLvqMQwnoSgXKBdHKEVpeoxYNNtBfrxQrPauttMzjKFayKwMeuChjzCocgAHfAmPCatOqarzLuabyTnxoheeocVshfERNssVPfRyPmwvOVGbzNAuvryYNWwIeyZLMlLbkcFFJRHjEIgIwOThRJJFpLbunVrbhAYsMtdsKslLAGElwrZjvZweIytMpPEYVmktQeNleNROcTjrNxXeHvOMMTMfqZHTUjetojHFzZwOekfAILYISANxeJFRNgeZDKoOTddXqxduPIjGXsRSSkgIqKMeSqlQwAKtdrkvHLgmKleNAPEztGMPmZzUuCImLAhzUnXmsVzFvJUTeIKleuRnMPNAPWJYAZLXgzTBPmkXVShbBSlIAJSeFgvRFvcoqfVFgHUefxUxuYFCfUxbxlOslUhYRFXKmMmqDIQhhfXyGqUwGMSYeLLpEsKAhvFUzavDCOUgtmmNMnsvfmCdPWuWIjuUfZCBTrWnaDopbqXcjzSqRMpQWIBNnMcOQZjDkjPkxsuwENYQyjgSHFJrgSLnwbEInBfdeIfBbVuZZbBrblJgKHOmLZACLQkSRxxQJeUMPIQutraxFtrRcSeqAejOTSqaFGglQOoWPkcNOnLIgfclWNtjGQRVMlqCPUnUlOLbHfkzUyNAmTsswWtZjIGUBrLmRmstHgVcRUgWdQTCEPRzjPVTMJRJocYHftwoRzOSyQexjmceRHdqFdgNuGmGTUdXQaNwKmvOUzZPzGCBVcbVLgMoQrESbpVGteVVntOwEWxXsZnSAoIfBSsWVhDFBuDTkcrnsPdmmSHymouxHlcgtjgKUAPznxsIRUjDFsrjadJjEtPaWTVBHpatqYeSgrpWJDOGfgIGQPcTIXVsCVyCfKMpcXWGkvwuRuTmvCbNMLeUkZrEpYZdlKAgFELfwCCbZCYBcXhfUrsIHfdwhYyxHKAMYMERwlyRtxObDoxBhjXmynYkmkYZrkzlCuvrhW";
        System.out.println(AmazingSubstrings(s)); // returns 20
    }
    public static long AmazingSubstrings(String s) {
        // Set<Integer> vowels = new HashSet<>();
        // Set<Character> vowels = Set.of('A','E','I','O','U','a','e','i','o','u');
        Set<Integer> vowels = Set.of(65, 69, 73, 79, 85, 97, 101, 105, 111, 117);
        // vowels.add(65);
        // vowels.add(69);
        // vowels.add(73);
        // vowels.add(79);
        // vowels.add(85);
        // vowels.add(97);
        // vowels.add(101);
        // vowels.add(105);
        // vowels.add(111);
        // vowels.add(117);
        long res = 0;
        for (int i=0; i<s.length(); i++) {
            if (vowels.contains((int)s.charAt(i))) {
                res += s.length()-i;
            }
        }
        return res%10003; // question mention to do this
    }
}
