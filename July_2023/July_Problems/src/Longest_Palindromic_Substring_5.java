// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Longest_Palindromic_Substring_5 {
    static int lo, maxLen = 0;
    public static String longestPalindrome(String s){
         int len = s.length();

        if(len < 2){
            return s;
        }

        for(int i = 0; i < len; i++){

            compute(s, i, i);
            compute(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }

    public static void compute(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        if(maxLen < j - i - 1){
            lo = i + 1;
            maxLen = j - i - 1;
        }
    }
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));

    }
}