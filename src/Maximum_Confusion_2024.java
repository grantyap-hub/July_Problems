import java.util.HashMap;

public class Maximum_Confusion_2024 {

    public static int max_confusion(String s, int k){

        int maxFreq = 0, i = 0;

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for(int j = 0; j < s.length(); j++){
            char currentChar = s.charAt(j);
            charCounts.put(currentChar, charCounts.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, charCounts.get(currentChar));

            if(j - i + 1 > maxFreq + k){
                charCounts.put(s.charAt(i), charCounts.get(s.charAt(i)) - 1);
                i++;
            }
        }
        return s.length() - i;
    }



    public static void main(String[] args){
        System.out.println(max_confusion("TTFF", 2));
        System.out.println(max_confusion("TFFT", 1));
        System.out.println(max_confusion("TTFTTFTT", 1));

    }
}
