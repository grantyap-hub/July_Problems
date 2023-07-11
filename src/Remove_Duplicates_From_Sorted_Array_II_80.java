public class Remove_Duplicates_From_Sorted_Array_II_80 {

    public static int remove_Dups(int[] nums){
        int i = 0;

        for(int n : nums){
            if(i < 2 || n > nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }


    public static void main(String[] args){

        System.out.println(remove_Dups(new int[]{1,1,1,2,2,3}));
        System.out.println(remove_Dups(new int[]{0,0,1,1,1,1,2,3,3}));

    }
}
