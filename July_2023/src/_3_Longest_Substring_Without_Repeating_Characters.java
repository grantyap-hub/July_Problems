import java.util.*;

public class _3_Longest_Substring_Without_Repeating_Characters {


    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> charCount = new HashSet<>();

        int first = 0, last = 0, ans = 0;

        while(first < s.length() && last <= first){
            if(!charCount.contains(s.charAt(first))){
                charCount.add(s.charAt(first));
                first++;
            } else{
                charCount.remove(s.charAt(last));
                last++;
            }
            ans = Math.max(ans, first - last);
        }
        return ans;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}
