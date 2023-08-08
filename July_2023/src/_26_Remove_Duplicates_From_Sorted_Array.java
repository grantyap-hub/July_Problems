public class _26_Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicates(int[] nums){
        int i = 0;

        for(int num : nums){
            if(i < 1 || num > nums[i-1]){
                nums[i++] = num;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
