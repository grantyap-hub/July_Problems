// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _5_Longest_Palindromic_Substring {
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

    public static String optimal(String s){
        StringBuilder sPrime = new StringBuilder("#");
        for(char c: s.toCharArray()){
            sPrime.append(c).append("#");
        }

        int n = sPrime.length();
        int[] palindromeRadii = new int[n];
        int center = 0;
        int radius = 0;

        for(int i = 0; i < n; i++){
            int mirror = 2 * center - i;

            if(i < radius){
                palindromeRadii[i] = Math.min(radius - i, palindromeRadii[mirror]);
            }

            while(i + 1 + palindromeRadii[i] < n &&
                i - 1 - palindromeRadii[i] >= 0 &&
                sPrime.charAt(i + 1 + palindromeRadii[i]) ==
                        sPrime.charAt(i - 1 - palindromeRadii[i])){
                palindromeRadii[i]++;
            }

            if(i + palindromeRadii[i] > radius) {
                center = i;
                radius = i + palindromeRadii[i];
            }
        }

        int maxLength = 0;
        int centerIndex = 0;

        for(int i = 0; i < n; i++){
            if(palindromeRadii[i] > maxLength) {
                 maxLength = palindromeRadii[i];
                 centerIndex = i;
            }
        }

        int startIndex = (centerIndex - maxLength) / 2;
        String longestPalindrome = s.substring(startIndex, startIndex + maxLength);
        return longestPalindrome;

    }
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(optimal("babad"));
        System.out.println(longestPalindrome("cbbd"));

    }
}