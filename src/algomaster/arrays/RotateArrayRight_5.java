package algomaster.arrays;

public class RotateArrayRight_5 {

    public void rotate(int[] nums, int k) {

        int x = 0;
        while(x<k){
            int last = nums[nums.length-1];
            for(int i = nums.length-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            x++;
        }
    }
}
