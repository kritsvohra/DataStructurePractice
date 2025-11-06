package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray_3 {

    public static int removeDuplicates(int[] arr){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i< arr.length; i++){
            treeSet.add(arr[i]);
        }
       return treeSet.size();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
    }
}
