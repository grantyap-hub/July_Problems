public class _134_Gas_Station {

    public static int canCompleteCircuit(int[] gas, int[] cost){
        int total = 0, avail = 0, index = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            avail += gas[i] - cost[i];
            if(avail < 0){
                avail = 0;
                index = i + 1;
            }

        }
        if(total < 0)
            return -1;
        return index;
    }


    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));

    }
}
