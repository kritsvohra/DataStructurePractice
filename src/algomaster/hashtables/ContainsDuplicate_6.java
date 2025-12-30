package algomaster.hashtables;

import java.util.HashMap;

public class ContainsDuplicate_6 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i<nums.length; i++){

            for (int j = i+1; j<nums.length; j++){

                if ((nums[i] == nums[j]) && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i<nums.length; i++){

            if (hashMap.containsKey(nums[i])){

                if (i - hashMap.get(nums[i])<=k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }


    public static void main(String[] args) {

        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearbyDuplicate2(nums, k));
    }
}
