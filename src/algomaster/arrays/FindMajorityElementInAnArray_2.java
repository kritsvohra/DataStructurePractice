package algomaster.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElementInAnArray_2 {

    public static int findMax(int[] nums){

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int maxValue = -1;
        int maxKey = -1;

        for (int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){

            if (entry.getValue()> maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(findMax(nums));
    }
}
