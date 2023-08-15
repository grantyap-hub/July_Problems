import java.util.*;
public class _151_Reverse_Words_In_A_String {


    public static String reverseWords(String s){
        s = s.trim();

        int i = 0;
        ArrayList<String> words = new ArrayList<>();
        while(true){
            StringBuilder temp = new StringBuilder();
            while(i < s.length() && s.charAt(i) != ' '){
                temp.append(s.charAt(i));
                i++;
            }
            words.add(temp.toString());
            if(i >= s.length()) break;
            while(i < s.length() && s.charAt(i) == ' '){
                i++;
            }
        }
        StringBuilder output = new StringBuilder();
        for(i = words.size() - 1; i >= 0; i--){
            output.append(words.get(i));
            if(i == 0) break;
            output.append(" ");
        }
        return output.toString();


    }


    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
