import java.util.HashMap;
import java.util.Map;

public class _137_Single_Number_II {

    public static int singleNumberBrute(int[] nums){
        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int n : nums){
            elements.put(n, elements.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int singleNumberBit(int[] nums){
        int ans = 0;

        for(int i = 0; i < 32; ++i){
            int sum = 0;
            for(final int num : nums)
                sum += num >> i & 1;
            sum %= 3;
            ans |= sum << i;
        }

        return ans;
    }

    public static int singleNumberMagic(int[] nums){
        int ones = 0;
        int twos = 0;

        for (final int num : nums) {
            ones ^= (num & ~twos);
            twos ^= (num & ~ones);
        }

        return ones;
    }


    public static void main(String[] args) {

        System.out.println(singleNumberBrute(new int[]{2,2,3,2}));
        System.out.println(singleNumberBrute(new int[]{0,1,0,1,0,1,99}));

    }
}
