package algomaster.arrays;

import java.util.Arrays;

public class MoveZeroesToRight_1 {

    public static void moveZeroes(int[] nums) {

        int pos = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length){
            nums[pos] = 0;
            pos++;
        }

        for (int i = 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {

        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
    }
}
