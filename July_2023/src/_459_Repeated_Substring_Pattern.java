import java.sql.SQLOutput;

public class _459_Repeated_Substring_Pattern {

    public static boolean repeatedSubstringPattern(String s){
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length()-1);
        return sub.contains(s);
    }


    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababababab"));
    }
}
