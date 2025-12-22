package algomaster.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumberInArray_1 {

    public static int singleNumber(int[] nums){

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i<nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()){

            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 4, 4, 8, 7, 8};
        System.out.println(singleNumber(nums));
    }
}
