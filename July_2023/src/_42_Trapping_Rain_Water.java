public class _42_Trapping_Rain_Water {


    public static int trap(int[] height){
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){
            if(max < height[i]){
                max = height[i];
            }
            lmax[i] = max;
        }
        max = Integer.MIN_VALUE;

        for(int i = height.length - 1; i >= 0; i--){
            if(max < height[i]){
                max = height[i];
            }
            rmax[i] = max;
        }
        int count = 0;
        for(int i = 0; i < height.length; i++){
            count += (Math.min(lmax[i],rmax[i]) - height[i]);
        }
        return count;

    }


    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
