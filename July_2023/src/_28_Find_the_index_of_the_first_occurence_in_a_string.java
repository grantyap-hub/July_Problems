public class _28_Find_the_index_of_the_first_occurence_in_a_string {

    public static int strstr(String haystack, String needle){
        int i = 0;
        while(i + needle.length() <= haystack.length()){
            if(haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
            i++;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(strstr("sadbutsad","sad"));
    }
}
