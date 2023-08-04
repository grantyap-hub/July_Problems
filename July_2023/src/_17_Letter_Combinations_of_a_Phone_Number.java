import java.util.*;
public class _17_Letter_Combinations_of_a_Phone_Number {

    static String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;
        rec(digits, new StringBuilder(), 0, result);
        return result;
    }

    public static void rec(String digits, StringBuilder ans, int begin, List<String> result){
        if(ans.length() == digits.length()){
            result.add(ans.toString());
            return;
        }

        for(int i = 0; i < letters[digits.charAt(begin)-'0'].length(); i++){
            ans.append(letters[digits.charAt(begin)-'0'].charAt(i));
            rec(digits, ans, begin + 1, result);
            ans.deleteCharAt(ans.length()-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));

    }
}
